/**
 * StaticCounter.java
 *
 * Shows using a static variable to count created instances.
 *
 * Run:
 *   javac StaticCounter.java
 *   java StaticCounter
 */
public class StaticCounter {

    static class User {
        // static counter shared across all users
        private static int count = 0;

        private String name;

        public User(String name) {
            this.name = name;
            count++; // increment when a new user is created
        }

        public static int getCount() {
            return count;
        }

        // The toString() method defines how a User object should be displayed as text.
        // Even though we are not printing User objects directly in this demo,
        // overriding toString() is a good practice so that if we print u1, u2, u3 in the future,
        // Java will show meaningful information instead of the default memory address.
        public String toString() {
            return "User[name=" + name + "]";
        }
    }

    public static void main(String[] args) {
        System.out.println("Users before creation: " + User.getCount());
        User u1 = new User("Alice");
        User u2 = new User("Bob");
        User u3 = new User("Charlie");
        System.out.println("Users after creation: " + User.getCount());
    }
}