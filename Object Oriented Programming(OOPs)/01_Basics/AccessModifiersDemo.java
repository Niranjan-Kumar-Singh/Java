/**
 * AccessModifiersDemo.java
 *
 * Demonstrates the four access levels in Java:
 * - public
 * - private
 * - protected
 * - default (package-private)
 *
 * Notes:
 * - This demo shows accessibility inside the same class.
 * - protected & default are more visible within the same package.
 */
public class AccessModifiersDemo {

    public int publicField = 10; // accessible everywhere
    private int privateField = 20; // only inside this class
    protected int protectedField = 30; // accessible in same package and subclasses
    int defaultField = 40; // package-private: accessible in same package

    public static void main(String[] args) {
        AccessModifiersDemo demo = new AccessModifiersDemo();

        System.out.println("publicField: " + demo.publicField);
        System.out.println("privateField: " + demo.privateField); // allowed here
        System.out.println("protectedField: " + demo.protectedField);
        System.out.println("defaultField (package-private): " + demo.defaultField);

        System.out.println("\nNote: From other classes in the same package you can access public, protected, and default (package-private).");
        System.out.println("From subclasses in other packages you can access public and protected (if subclass), but NOT default or private.");
    }
}