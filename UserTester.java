//A tester class for testing User.java

public class UserTester {
    public static void main(String[] args) {
        // Create a new User instance
        User user = new User("danielgallagher", "securepassword123", "daniel.gallagher@example.com");
        
        // Call the register method to simulate user registration
        user.register();
        
        // Print confirmation message
        System.out.println("User registration successful!");
    }
}
