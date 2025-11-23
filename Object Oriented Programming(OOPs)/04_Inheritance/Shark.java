/**
 * Shark.java
 *
 * Demonstrates multi-level inheritance when combined with other helper classes.
 * (This is a simple subclass of Animal – in larger examples Shark could extend
 * Fish, etc.)
 */
public class Shark extends Animal {

    public Shark() {
        super("Shark", "grey");
    }

    @Override
    public void eat() {
        System.out.println(name + " hunts and eats fish.");
    }

    public void swim() {
        System.out.println(name + " swims powerfully.");
    }
}