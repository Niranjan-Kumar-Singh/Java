/**
 * HybridInheritance.java
 *
 * Java does not support multiple inheritance via classes (A extends B, C) to
 * avoid the
 * "diamond problem". Hybrid inheritance mixes class inheritance and interfaces.
 *
 * This demo shows:
 * - class inheritance (Dog extends Animal)
 * - interface implementation (Swimmable)
 *
 * Save as HybridInheritance.java and run to see combined behavior.
 */

// A small interface to add behavior
interface Swimmable {
    void swim();
}

// A new class that extends Animal and implements Swimmable
class Dolphin extends Animal implements Swimmable {
    public Dolphin(String name) {
        super(name, "grey");
    }

    @Override
    public void breathe() {
        System.out.println(name + " breathes (but can hold breath underwater).");
    }

    @Override
    public void swim() {
        System.out.println(name + " swims gracefully.");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        System.out.println("== Hybrid Inheritance Demo (class + interface) ==");

        Dolphin dolly = new Dolphin("Dolly");
        dolly.showInfo(); // from Animal
        dolly.breathe(); // overridden
        dolly.swim(); // from Swimmable

        // Demonstrates mixing inheritance and interface for hybrid behavior.
        System.out.println("== End Demo ==");
    }
}