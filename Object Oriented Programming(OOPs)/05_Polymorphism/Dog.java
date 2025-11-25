/**
 * Dog.java
 * Another child class overriding eat() method.
 */
public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("Dog eats meat");
    }

    public void fetch() {
        System.out.println("Dog fetches the ball");
    }
}