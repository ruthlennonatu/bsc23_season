// require the bcrypt module
const bcrypt = require('bcrypt');

app.post('/login', (req, res) => {
    // get username and password from request body
    const { username, password } = req.body;
    // query to check if username exists in database
    const query = 'SELECT password, membership FROM users WHERE username = ?';

    // query that runs when the username is found and returns the password and membership type
    db.query(query, [username], async (error, results) => {
        if (error) {
            console.error(error);
            res.status(500).json({ error: 'Internal Server Error' });
            // if the username is not found in the database
        } else if (results.length > 0) {
            // hashes the password
            const hash = results[0].password;
            // compares the password with the hash
            const match = await bcrypt.compare(password, hash);
            // if the password matches, return the membership type
            if (match) {
                res.json({ membershipType: results[0].membership });
                // if the password does not match
            } else {
                res.status(401).json({ error: 'Invalid password' });
            }
            // if the username is not found in the database
        } else {
            res.status(401).json({ error: 'Invalid username' });
        }
    });
});

app.listen(3000, () => console.log('Server is running on port 3000'));