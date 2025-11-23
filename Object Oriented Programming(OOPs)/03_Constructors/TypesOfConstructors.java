/**
 * TypesOfConstructors.java
 *
 * Demonstrates constructor overloading (multiple constructors with different
 * signatures).
 * This shows how you can provide many ways to instantiate an object.
 */
public class TypesOfConstructors {

    String name;
    int value;
    boolean flag;

    // Default constructor
    public TypesOfConstructors() {
        this("none", 0, false);
    }

    // One-argument constructor
    public TypesOfConstructors(String name) {
        this(name, 0, false);
    }

    // Two-argument constructor
    public TypesOfConstructors(String name, int value) {
        this(name, value, false);
    }

    // Full constructor
    public TypesOfConstructors(String name, int value, boolean flag) {
        this.name = name;
        this.value = value;
        this.flag = flag;
    }

    /**
     * toString() method:
     *
     * System.out.println(object) automatically calls object.toString().
     * Because we override this method, any time an object of this class is printed,
     * it shows a clean readable format instead of memory address.
     *
     * Example:
     * System.out.println(a);
     * becomes:
     * System.out.println(a.toString());
     */
    @Override
    public String toString() {
        return "TypesOfConstructors[name=" + name + ", value=" + value + ", flag=" + flag + "]";
    }

    public static void main(String[] args) {
        System.out.println("=== Types of constructors (overloading) ===");
        TypesOfConstructors a = new TypesOfConstructors();
        TypesOfConstructors b = new TypesOfConstructors("A");
        TypesOfConstructors c = new TypesOfConstructors("B", 10);
        TypesOfConstructors d = new TypesOfConstructors("C", 20, true);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println("=== End ===");
    }
}