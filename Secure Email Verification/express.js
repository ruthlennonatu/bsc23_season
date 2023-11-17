const express = require('express');
// Node package to send emails
const nodemailer = require('nodemailer');
// Node package to generate random secure tokens
const crypto = require('crypto');
const app = express();
const mysql = require('mysql');
// Node package to encrypt passwords using both salting and hashing techniques
const bcrypt = require('bcrypt');
const saltRounds = 10;

let db = mysql.createConnection({
  host: 'localhost',
  user: 'root',
  password: '',
  database: 'gaaseason'
});

db.connect((err) => {
  if (err) throw err;
  console.log('Connected to database');
});

let User = {
    create: (email, password, token) => {
        // Hashing password with salt
        bcrypt.hash(password, saltRounds, function(err, hash) {
            if (err) throw err;
            // Storing user in database with hashed password and token, the question marks prevent SQL injection by only allowing the values to be inserted as values and not as SQL code
            let query = `INSERT INTO users (email, password, token, verified) VALUES (?, ?, ?, false)`;
            db.query(query, [email, hash, token], (err, result) => {
                if (err) throw err;
                console.log('User created');
            });
        });
    },
    // Verifying user by updating verification status to true
    verify: (token) => {
        // Updating user in database with verified status, more SQL injection prevention
        let query = `UPDATE users SET verified = true WHERE token = ?`;
        db.query(query, [token], (err, result) => {
            if (err) throw err;
            console.log('User verified');
        });
    }
};

// Signup page
app.get('/signup', (req, res) => {
    // Generating a random token for email verification
    let token = crypto.randomBytes(64).toString('hex');
    // Creating a user with email and token
    User.create(req.query.email, token);

    // Sending email to user with verification link through the gaaseason gmail account
    let transporter = nodemailer.createTransport({
        service: 'gmail',
        auth: {
            user: 'gaaseason@gmail.com',
            pass: 'adminpaassword'
        }
    });
    
    // Email content
    let mailOptions = {
        from: 'gaaseason@gmail.com',
        // Email address to send to
        to: req.query.email,
        subject: 'Email Verification',
        // Verification link with token
        text: `Please verify your email by clicking the following link: http://localhost:3000/verify?token=${token}`
    };

    // Sending email
    transporter.sendMail(mailOptions, (error, info) => {
        if (error) {
            console.log(error);
        } else {
            // Email sent
            console.log('Email sent: ' + info.response);
        }
    });

    res.send('Signup successful');
});

// Verifying email
app.get('/verify', (req, res) => {
    User.verify(req.query.token);
    res.send('Email verified');
});

app.listen(3000, () => {
    console.log('gaaseason is being hosted on port 3000');
});