/**
 * Car.java
 *
 * Interface = blueprint of a class.
 * Interface Features:
 * - 100% abstraction (until Java 7)
 * - All methods are public and abstract by default
 * - Variables are public, static, and final by default
 * - No constructors allowed
 * - Supports multiple inheritance
 */
public interface Car {

    // abstract method (public & abstract by default)
    void start();

    // default method (Java 8+)
    default void stop() {
        System.out.println("Car stops");
    }

    // static method (Java 8+)
    static void wheels() {
        System.out.println("All cars have 4 wheels");
    }
}