CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL
);

INSERT INTO users (email, password) VALUES
    ('mario@gmail.com', 'password'),
    ('luigi@gmail.com', 'password'),
    ('bowser@gmail.com', 'password');

CREATE TABLE clubs (
    club_id INT AUTO_INCREMENT PRIMARY KEY,
    club_name VARCHAR(100) NOT NULL,
    description TEXT,
    location VARCHAR(100)
);

INSERT INTO clubs (club_name, description, location) VALUES
    ('Naomh Padraig', 'Bad team', 'Lifford'),
    ('Sigersons', 'Good team', 'Strabane'),
    ('Red Hughs', 'Mid team', 'The Cross');


CREATE TABLE subscriptions (
    subscription_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    price INT
);

INSERT INTO subscriptions (name, price) VALUES
    ('season pass', 50),
    ('elite', 100),
    ('platinum', 150);
