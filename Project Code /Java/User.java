// Daniel Gallagher

// User.java
public class User {
    private String username;
    private String password;
    private String email;
    
    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
    
    public void register() {
        String url = "jdbc:mysql://localhost:3306/example_database_name";
        String user = "example_database_user";
        String password = "example_database_password";

        String sql = "INSERT INTO users (username, email, password) VALUES (?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, this.username);
            preparedStatement.setString(2, this.email);
            preparedStatement.setString(3, this.password);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("User registered successfully!");
            }
        } catch (SQLException e) {
            System.out.println("Error occurred while registering the user.");
            e.printStackTrace();
        }
    }
}
