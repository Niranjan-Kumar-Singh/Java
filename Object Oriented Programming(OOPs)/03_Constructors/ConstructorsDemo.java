/**
 * ConstructorsDemo.java
 *
 * Uses Student.java to demonstrate:
 * - default constructor
 * - parameterized constructor
 * - printing object state
 *
 * This is the cleaned & documented version of your original Constructors class.
 */
public class ConstructorsDemo {
    public static void main(String[] args) {

        System.out.println("=== Constructors demo ===\n");

        // Parameterized constructor
        Student s = new Student("Niranjan", 17);
        System.out.println("s.name = " + s.name);
        System.out.println("s.roll = " + s.roll);

        // set marks
        s.marks[0] = 100;
        s.marks[1] = 90;
        s.marks[2] = 80;

        System.out.print("Marks of s: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(s.marks[i] + " ");
        }
        System.out.println("\n");

        // Non-parameterized (default) constructor
        Student s2 = new Student();
        System.out.println("s2 (default): " + s2);

        System.out.println("\n=== End of Constructors demo ===");
    }
}