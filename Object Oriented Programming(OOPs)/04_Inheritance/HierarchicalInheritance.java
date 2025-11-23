/**
 * HierarchicalInheritance.java
 *
 * Demonstrates hierarchical inheritance:
 * Multiple child classes inherit from a single parent.
 *
 * Example:
 * Dog extends Animal
 * Cat extends Animal
 */
public class HierarchicalInheritance {
    public static void main(String[] args) {
        System.out.println("== Hierarchical Inheritance Demo ==");

        Dog dog = new Dog("Rex", "brown");
        Cat cat = new Cat("Whiskers");

        dog.showInfo();
        dog.eat();
        dog.fetch();

        System.out.println();

        cat.showInfo();
        cat.eat();
        cat.purr();

        System.out.println("== End Demo ==");
    }
}