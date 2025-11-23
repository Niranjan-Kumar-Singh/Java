/**
 * Cat.java
 *
 * Another subclass of Animal used for hierarchical inheritance demo.
 */
public class Cat extends Animal {

    public Cat() {
        super("Cat");
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " eats cat food.");
    }

    public void purr() {
        System.out.println(name + " purrs.");
    }
}