/**
 * StaticVariablesDemo.java
 *
 * Demonstrates static (class) variables vs instance variables.
 *
 * Key points:
 *  - static variables are shared across all instances of the class.
 *  - instance variables are unique per object.
 *
 * Run:
 *   javac StaticVariablesDemo.java
 *   java StaticVariablesDemo
 */
public class StaticVariablesDemo {

    static class Box {
        // static variable: shared by all Box objects
        public static String category = "General";

        // instance variable: unique to each Box object
        public int weight;

        public Box(int weight) {
            this.weight = weight;
        }

        // The toString() method returns a String representation of the object.
        // When you print an object (System.out.println(b1)), Java automatically calls toString().
        // We override it to show meaningful information instead of the default memory address.
        @Override
        public String toString() {
            return "Box[category=" + category + ", weight=" + weight + "]";
        }
    }

    public static void main(String[] args) {
        Box b1 = new Box(10);
        Box b2 = new Box(20);

        System.out.println("Before change:");
        System.out.println(b1);
        System.out.println(b2);

        // change the static variable via class name
        Box.category = "Fragile";

        System.out.println("\nAfter changing static variable:");
        System.out.println(b1);
        System.out.println(b2);

        // change static via object (allowed but not recommended)
        b1.category = "Heavy"; // still changes for all
        System.out.println("\nAfter changing static via object (not recommended):");
        System.out.println(b1);
        System.out.println(b2);
    }
}