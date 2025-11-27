import models.FinalPerson;

/**
 * FinalVariableDemo.java
 *
 * Demonstrates final variables:
 *  - final primitive (constant)
 *  - final reference (reference cannot change, but object can)
 *  - blank final (assigned in constructor)
 *
 * Compile & run:
 *   javac FinalVariableDemo.java
 *   java FinalVariableDemo
 */

public class FinalVariableDemo {

    // final primitive constant (compile-time constant)
    public static final int MAX_USERS = 100;

    // final reference: the reference cannot be reassigned, but object fields can change
    public static final FinalPerson GLOBAL_PERSON = new FinalPerson("Global", 30);

    // blank final instance variable (must be initialized in constructor)
    private final int id;

    public FinalVariableDemo(int id) {
        this.id = id; // allowed: assign blank final in constructor
    }

    public static void main(String[] args) {
        System.out.println("MAX_USERS = " + MAX_USERS);

        System.out.println("Before change: " + GLOBAL_PERSON);
        // Allowed: modify internal state of referenced object
        GLOBAL_PERSON.setAge(31);
        System.out.println("After changing object field: " + GLOBAL_PERSON);

        // Not allowed: reassign final reference (uncommenting next line causes compile error)
        // GLOBAL_PERSON = new Person("Another", 22); // ❌ compile error

        FinalVariableDemo demo = new FinalVariableDemo(101);
        System.out.println("Demo id (blank final): " + demo.id);

        // final local variable
        final int localFinal = 5;
        System.out.println("localFinal = " + localFinal);
        // localFinal = 6; // ❌ compile error if uncommented
    }
}