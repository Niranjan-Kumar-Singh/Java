/**
 * Dog.java
 *
 * Subclass of Animal to demonstrate overriding and additional behavior.
 */
public class Dog extends Animal {

    public Dog() {
        super("Dog");
    }

    public Dog(String name) {
        super(name);
    }

    public Dog(String name, String color) {
        super(name, color);
    }

    // Additional behavior
    public void fetch() {
        System.out.println(name + " fetches a ball.");
    }

    // Overriding a parent method
    @Override
    public void eat() {
        System.out.println(name + " eats dog food.");
    }
}