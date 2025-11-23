/**
 * Student.java
 *
 * A simple Student class used in basic OOP demos.
 * Demonstrates:
 * - private fields + public getters (encapsulation)
 * - constructors (default and parameterized)
 * - a small behavior method (calculatePercentage)
 *
 * Note:
 * percentage calculation uses float division to avoid integer truncation.
 */
public class Student {

    // Private fields: hide internal representation (encapsulation)
    private String name;
    private int age;
    private float percentage;

    /**
     * Default constructor.
     */
    public Student() {
        this("unknown", 0);
    }

    /**
     * Parameterized constructor.
     *
     * @param name student name
     * @param age  student age
     */
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.percentage = 0.0f;
    }

    /**
     * Calculate percentage from marks in three subjects.
     * Uses float division to get a decimal percentage.
     *
     * @param phy  marks in Physics
     * @param chem marks in Chemistry
     * @param math marks in Math
     */
    public void calculatePercentage(int phy, int chem, int math) {
        this.percentage = (phy + chem + math) / 3.0f; // note 3.0f for float division
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getPercentage() {
        return percentage;
    }

    /**
     * Helper to print student details.
     */
    public void show() {
        System.out.println("Student -> name: " + name + ", age: " + age + ", %: " + percentage);
    }

    @Override
    public String toString() {
        return "Student[name=" + name + ", age=" + age + ", percentage=" + percentage + "]";
    }
}