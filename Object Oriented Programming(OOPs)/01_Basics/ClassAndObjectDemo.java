/**
 * ClassAndObjectDemo.java
 *
 * Demonstrates creating objects, using fields, constructors, getters/setters,
 * and calling methods from simple classes (Pen and Student).
 *
 * How to run (from project root):
 * javac 01_Basics/*.java
 * java -cp 01_Basics ClassAndObjectDemo
 */
public class ClassAndObjectDemo {

    public static void main(String[] args) {

        System.out.println("=== Pen examples ===");

        // Using default constructor
        Pen p1 = new Pen();
        p1.show(); // default values

        // modify fields via setters
        p1.setColor("Blue");
        p1.setTip(5);

        // When we do "String + object", Java automatically calls p1.toString().
        // Because we overrode the toString() method in Pen.java,
        // the object prints in a readable format:
        // Pen[color=Blue, tip=5]
        // If toString() was not overridden, it would print something like:
        // Pen@4a574795 (default memory address)
        System.out.println("After update: " + p1);

        // Using parameterized constructor
        Pen p2 = new Pen("Green", 3);
        p2.show();

        System.out.println("\n=== Student examples ===");

        // Default student
        Student s1 = new Student();
        s1.show();

        // Parameterized student and using behavior
        Student s2 = new Student("Niranjan", 21);
        s2.calculatePercentage(85, 90, 78);
        s2.show();

        // Accessing getters
        System.out.println(s2.getName() + " scored " + s2.getPercentage() + "%");

        System.out.println("\nDemo complete. These simple objects live on the heap and their references are on the stack.");
    }
}