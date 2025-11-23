/**
 * EncapsulationDemo.java
 *
 * Encapsulation:
 *   → Wrapping data + related methods inside a single unit (class)
 *   → Restricting direct access to data using PRIVATE variables
 *   → Accessing/modifying data through PUBLIC methods
 *
 * This prevents accidental misuse and keeps data SAFE.
 */
public class EncapsulationDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        // Setting username
        account.setUsername("niranjan@123");

        // ❌ Cannot access password directly → account.password = "abcd";  (NOT ALLOWED)
        // ✔ Use setter instead
        account.setPassword("abcd1234");

        System.out.println("Username: " + account.getUsername());
        System.out.println("Password Verified? " + account.verifyPassword("abcd1234"));
    }
}