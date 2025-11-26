/**
 * ConstructorChainingParent.java
 *
 * Demonstrates constructor chaining between Parent -> Child
 * using super(parameters).
 */
public class ConstructorChainingParent {

    public ConstructorChainingParent() {
        System.out.println("Parent: Default constructor");
    }

    public ConstructorChainingParent(String msg) {
        System.out.println("Parent: " + msg);
    }
}