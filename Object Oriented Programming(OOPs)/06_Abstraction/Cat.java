/**
 * Cat.java
 * Another subclass of abstract class Animal.
 */
public class Cat extends Animal {

    public Cat() {
        System.out.println("Cat constructor called");
    }

    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}