/**
 * SingleInheritance.java
 *
 * Simple demo showing single-level inheritance:
 * Dog extends Animal
 *
 * Run:
 * javac *.java
 * java SingleInheritance
 */
public class SingleInheritance {
    public static void main(String[] args) {
        System.out.println("== Single Level Inheritance Demo ==");

        Dog dog = new Dog("Buddy", "brown");
        dog.showInfo(); // inherited method
        dog.eat(); // overridden method
        dog.breathe(); // inherited method
        dog.fetch(); // Dog-specific method

        System.out.println("== End Demo ==");
    }
}