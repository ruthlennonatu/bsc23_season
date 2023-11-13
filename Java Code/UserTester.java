// A Tester class for User.java
// Daniel Gallagher

public class UserTester {
    public static void main(String[] args) {
        try {
            // Create a new User instance with a username, password, and email
            User user = new User("danielgallagher", "securepassword123", "daniel.gallagher@example.com");
            
            // Call the register method to simulate user registration
            // This will attempt to insert the user's data into the database
            boolean isRegistered = user.register();

            // Check if the registration was successful
            if (isRegistered) {
                System.out.println("User registration successful!");
            } else {
                System.out.println("User registration failed.");
            }
        } catch (Exception e) {
            // Handle any exceptions that may occur during the user registration process
            // This could include database connection failures, SQL exceptions, etc.
            System.out.println("An error occurred during user registration: " + e.getMessage());
        }
    }
}
