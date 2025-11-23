/**
 * DeepCopyStudent.java
 *
 * Demonstrates a deep copy constructor: the marks array is duplicated so the
 * copied object gets its own independent copy of the array.
 */
public class DeepCopyStudent {
    public String name;
    public int roll;
    public int[] marks;

    public DeepCopyStudent(String name, int roll, int[] marks) {
        this.name = name;
        this.roll = roll;
        this.marks = new int[marks.length];
        for (int i = 0; i < marks.length; i++)
            this.marks[i] = marks[i];
    }

    // deep copy constructor
    public DeepCopyStudent(DeepCopyStudent other) {
        this.name = other.name;
        this.roll = other.roll;
        this.marks = new int[other.marks.length];
        for (int i = 0; i < other.marks.length; i++) {
            this.marks[i] = other.marks[i];
        }
    }
    /**
     * toString() method:
     *
     * System.out.println(object) internally calls object.toString().
     *
     * Because this class overrides toString(), the object prints in a clean,
     * readable way instead of showing the default memory address.
     *
     * Example printed output:
     *     DeepCopyStudent[name=B, roll=2, marks=[100,90,80]]
     *
     * Without this method, Java would print:
     *     DeepCopyStudent@6f2b958e
     *
     * Overriding toString() is a common practice to improve debugging and clarity.
     */
    @Override
    public String toString() {
        return "DeepCopyStudent[name=" + name + ", roll=" + roll + ", marks=[" + marks[0] + "," + marks[1] + "," + marks[2] + "]]";
    }
}