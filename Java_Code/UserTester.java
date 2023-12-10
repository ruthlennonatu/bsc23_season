// A Tester class for User.java
// Daniel Gallagher

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class UserTester {

    @Test
    void CreateUserAndRegister() {
        // Create a new user with a username, password, and email
        User user = new User("danielgallagher", "securepassword123", "daniel.gallagher@example.com");

        // Call the create method to validate user creation
        assertTrue(user.create()); // Verify successful user creation

        // Call the register method to simulate user registration
        boolean isRegistered = user.register();

        // Check if the registration was successful
        if (isRegistered) {
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration failed.");
        }

        // Assert successful user creation after registration
        assertEquals(true, user.create());
    }
}
