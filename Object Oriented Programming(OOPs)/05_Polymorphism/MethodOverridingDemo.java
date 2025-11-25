/**
 * MethodOverridingDemo.java
 *
 * Demonstrates Runtime Polymorphism using Animal → Deer.
 */
public class MethodOverridingDemo {

    public static void main(String[] args) {

        Animal a = new Animal();
        a.eat();

        Deer d = new Deer();
        d.eat();

        Animal poly = new Deer();  // runtime polymorphism
        poly.eat();                // Deer.eat() executes
    }
}