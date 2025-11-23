/**
 * ShallowCopyStudent.java
 *
 * Demonstrates a shallow copy constructor: the marks array reference is copied,
 * so both source and copy share the same array. Modifying marks in one object
 * will be visible in the other.
 */
public class ShallowCopyStudent {
    public String name;
    public int roll;
    public int[] marks;

    public ShallowCopyStudent(String name, int roll, int[] marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks; // direct reference (shallow)
    }

    // shallow copy constructor
    public ShallowCopyStudent(ShallowCopyStudent other) {
        this.name = other.name;
        this.roll = other.roll;
        this.marks = other.marks; // same reference -> shallow copy
    }

    /**
     * toString() method:
     *
     * When we print an object, for example:
     * System.out.println(s1);
     *
     * Java automatically calls:
     * s1.toString()
     *
     * Because we OVERRIDED this method, Java returns a clean readable format:
     * ShallowCopyStudent[name=A, roll=1, marks=[100,90,80]]
     *
     * If we DID NOT override toString(), Java would print something ugly:
     * ShallowCopyStudent@4a574795
     * (This is the default memory address representation)
     *
     * Overriding toString() makes debugging easier and output meaningful.
     */
    @Override
    public String toString() {
        return "ShallowCopyStudent[name=" + name + ", roll=" + roll + ", marks=[" + marks[0] + "," + marks[1] + "," + marks[2] + "]]";
    }
}