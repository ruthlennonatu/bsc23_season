// Daniel Gallagher 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;
import java.math.BigInteger;

public class User {
    // Instance variables to store user information
    private String username;
    private String password;
    private String email;
    
    // Constructor to initialize a User object with username, password, and email
    public User(String username, String password, String email) {
        this.username = username;
        this.password = hashPassword(password); // Hash the password during object construction
        this.email = email;
    }

    // Method to hash a password using SHA-256
    private static String hashPassword(String password) {
        try {
            // Create a MessageDigest instance for SHA-256
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            // Perform the hash
            byte[] hashedBytes = md.digest(password.getBytes(StandardCharsets.UTF_8));

            // Convert byte array into signum representation
            BigInteger number = new BigInteger(1, hashedBytes);

            // Convert the hash into hexadecimal format
            StringBuilder hexString = new StringBuilder(number.toString(16));

            // Pad with leading zeros
            while (hexString.length() < 32) {
                hexString.insert(0, '0');
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            // Handle the exception according to your needs
            throw new RuntimeException(e);
        }
    }
    
    // Method to handle user registration
    public void create() {
        // Database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/your_database"; // Update with the database details
        String dbUsername = "root"; // Update with the database username
        String dbPassword = "password"; // Update with the database password

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // Establish a connection to the database
            conn = DriverManager.getConnection(url, dbUsername, dbPassword);

            // SQL query to insert the user data into the 'users' table
            String sql = "INSERT INTO users (username, email, password) VALUES (?, ?, ?)";

            // Prepare the statement to prevent SQL injection
            pstmt = conn.prepareStatement(sql);

            // Set parameters
            pstmt.setString(1, this.username);
            pstmt.setString(2, this.email);
            pstmt.setString(3, this.password);

            // Execute the query
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close connections to avoid memory leaks
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    // Getters and setters for each field
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = hashPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // public boolean create() {
    //     return true;
    // }

}


