/**
 * Dog.java
 * Concrete subclass of abstract class Animal.
 */
public class Dog extends Animal {

    public Dog() {
        System.out.println("Dog constructor called");
    }

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}