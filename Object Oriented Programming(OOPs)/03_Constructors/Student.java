/**
 * Student.java
 *
 * Basic Student class used in constructors demos.
 *
 * - Shows default (no-arg) and parameterized constructors.
 * - Holds a small marks array to demonstrate shallow vs deep copy behaviour.
 *
 * Note: This class intentionally does NOT implement the copy constructor here.
 * Copy constructors are demonstrated in separate classes to keep examples
 * clean.
 */
public class Student {
    public String name;
    public int roll;
    public int[] marks;

    // Default (non-parameterized) constructor
    public Student() {
        System.out.println("[Student] Non-parameterized constructor called");
        this.name = "unknown";
        this.roll = 0;
        this.marks = new int[3]; // default marks array
    }

    // Parameterized constructor
    public Student(String name, int roll) {
        System.out.println("[Student] Parameterized constructor called");
        this.name = name;
        this.roll = roll;
        this.marks = new int[3];
    }

    @Override
    public String toString() {
        return "Student[name=" + name + ", roll=" + roll + ", marks=[" + marks[0] + "," + marks[1] + "," + marks[2] + "]]";
    }

    public void show() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'show'");
    }

    public void calculatePercentage(int i, int j, int k) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculatePercentage'");
    }

    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }

    public String getPercentage() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPercentage'");
    }
}