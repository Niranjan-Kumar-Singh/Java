/**
 * ConstructorChainingChild.java
 *
 * Shows how to call parameterized parent constructors using super().
 */
public class ConstructorChainingChild extends ConstructorChainingParent {

    public ConstructorChainingChild() {
        super("Called from Child's constructor");
        System.out.println("Child: Constructor executed");
    }

    public static void main(String[] args) {
        new ConstructorChainingChild();
    }
}