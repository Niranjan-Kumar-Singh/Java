/**
 * Animal.java
 *
 * Base class for inheritance demos.
 * Keeps things small: name and basic behaviors.
 */
public class Animal {
    protected String name; // protected so subclasses can access it
    protected String color;

    public Animal() {
        this.name = "Unknown";
        this.color = "Unknown";
    }

    public Animal(String name) {
        this.name = name;
        this.color = "Unknown";
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void eat() {
        System.out.println(name + " eats.");
    }

    public void breathe() {
        System.out.println(name + " breathes.");
    }

    public void showInfo() {
        System.out.println("Animal{name=" + name + ", color=" + color + "}");
    }
}