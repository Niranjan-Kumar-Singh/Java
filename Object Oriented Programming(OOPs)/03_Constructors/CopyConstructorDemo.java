/**
 * CopyConstructorDemo.java
 *
 * Demonstrates the difference between shallow and deep copy using
 * ShallowCopyStudent and DeepCopyStudent classes.
 */
public class CopyConstructorDemo {
    public static void main(String[] args) {

        System.out.println("=== Copy Constructor Demo ===");

        int[] marks = { 100, 90, 80 };

        // Shallow copy example
        ShallowCopyStudent s1 = new ShallowCopyStudent("A", 1, marks);
        ShallowCopyStudent s2 = new ShallowCopyStudent(s1); // shallow copy

        System.out.println("Before change (shallow)");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        // change original marks
        s1.marks[0] = 95;
        s1.marks[1] = 85;
        s1.marks[2] = 75;

        System.out.println("\nAfter change (shallow) - both changed because marks is shared:");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        System.out.println("\n--- Now deep copy example ---");

        int[] marks2 = { 100, 90, 80 };
        DeepCopyStudent d1 = new DeepCopyStudent("B", 2, marks2);
        DeepCopyStudent d2 = new DeepCopyStudent(d1); // deep copy

        System.out.println("Before change (deep)");
        System.out.println("d1: " + d1);
        System.out.println("d2: " + d2);

        // change original marks of d1
        d1.marks[0] = 70;
        d1.marks[1] = 60;
        d1.marks[2] = 50;

        System.out.println("\nAfter change (deep) - only original changed:");
        System.out.println("d1: " + d1);
        System.out.println("d2: " + d2);

        System.out.println("\n=== End of Copy Constructor Demo ===");
    }
}
