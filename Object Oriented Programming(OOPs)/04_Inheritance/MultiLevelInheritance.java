/**
 * MultiLevelInheritance.java
 *
 * Demo for multi-level inheritance:
 * Example chain (conceptual): Animal -> Mammal -> Whale (here simplified)
 *
 * For clarity this demo uses Animal -> Dog (still shows that child inherits
 * from parent).
 *
 * In a larger project you would create an intermediate class (e.g., Mammal) and
 * then extend it.
 */
public class MultiLevelInheritance {
    public static void main(String[] args) {
        System.out.println("== Multi-Level Inheritance Demo ==");

        // Imagine: Animal -> Mammal -> Dog
        // Here we demonstrate that Dog (child) can use parent (Animal) behavior.
        Dog d = new Dog("Max", "black");
        d.showInfo(); // from Animal
        d.eat(); // overridden in Dog
        d.fetch(); // Dog-specific

        // Also show a deeper subclass if present (Shark is not a mammal but
        // demonstrates child behavior)
        Shark s = new Shark();
        s.showInfo();
        s.swim();

        System.out.println("== End Demo ==");
    }
}