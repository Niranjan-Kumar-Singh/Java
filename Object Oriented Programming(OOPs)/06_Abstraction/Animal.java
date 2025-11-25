/**
 * Animal.java
 *
 * Example of an abstract class.
 * Abstract Class Rules:
 * - Cannot be instantiated (no objects allowed)
 * - Can have abstract methods (no body)
 * - Can have normal methods (with body)
 * - Can have constructors
 * - Can have variables
 */
public abstract class Animal {

    // Constructor (YES, abstract classes can have constructors)
    public Animal() {
        System.out.println("Animal constructor called");
    }

    // Abstract method → child classes MUST implement it
    public abstract void sound();

    // Normal method → child inherits directly
    public void sleep() {
        System.out.println("Animal sleeps...");
    }
}