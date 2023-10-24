public class Admin {
    private String username;
    private String password;
    private String email;

    public Admin(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
    public void manageUsers() {
        // Logic for admin to manage user data (User CRUD)
    }

    public void manageProducts() {
        // Logic for admin to manage product data (Product CRUD)
    }
}
