/**
 * StaticBlockDemo.java
 *
 * Demonstrates static initialization blocks.
 *
 * Key points:
 *  - Static blocks run once when the class is loaded (before main or any instance).
 *  - Useful for complex static initialization (reading config, initializing maps, etc.).
 *
 * Run:
 *   javac StaticBlockDemo.java
 *   java StaticBlockDemo
 */
public class StaticBlockDemo {

    static class Config {
        public static String ENV;
        public static int MAX_CONNECTIONS;

        // static initialization block
        static {
            System.out.println("[Static Block] Initializing Config...");
            // simulated complex initialization
            ENV = System.getenv("APP_ENV"); // usually null in simple runs
            if (ENV == null) ENV = "development";

            if (ENV.equals("production")) {
                MAX_CONNECTIONS = 100;
            } else {
                MAX_CONNECTIONS = 10;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Config.ENV = " + Config.ENV);
        System.out.println("Config.MAX_CONNECTIONS = " + Config.MAX_CONNECTIONS);

        // static block ran once when Config class was loaded
    }
}