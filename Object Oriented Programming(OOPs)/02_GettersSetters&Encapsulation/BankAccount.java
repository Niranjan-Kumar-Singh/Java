/**
 * BankAccount.java
 *
 * Demonstrates Encapsulation in Java:
 * - Data is kept PRIVATE (username, password)
 * - Access is provided ONLY through public methods
 * - Password cannot be accessed directly from outside the class
 *
 * Encapsulation protects data and controls how values are set/changed.
 */
public class BankAccount {

    private String username; // private → not accessible outside directly
    private String password; // private → hidden data

    // Setter for username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter for username
    public String getUsername() {
        return this.username;
    }

    // Setter for password (with basic validation)
    public void setPassword(String password) {
        if (password.length() < 4) {
            System.out.println("Password too short. Must be at least 4 characters.");
            return;
        }
        this.password = password;
    }

    // Method to verify password (example of controlled access)
    public boolean verifyPassword(String enteredPassword) {
        return this.password != null && this.password.equals(enteredPassword);
    }
}