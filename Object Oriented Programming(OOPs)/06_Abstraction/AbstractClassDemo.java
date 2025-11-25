/**
 * AbstractClassDemo.java
 *
 * Demonstrates how abstract classes work.
 */
public class AbstractClassDemo {

    public static void main(String[] args) {

        // Animal a = new Animal(); ❌ Not allowed (Animal is abstract)

        Animal dog = new Dog();
        dog.sound();   // Dog's version
        dog.sleep();   // inherited method

        System.out.println("----------------");

        Animal cat = new Cat();
        cat.sound();   // Cat's version
        cat.sleep();   // inherited method
    }
}