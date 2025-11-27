package models;

public class FinalParent {

    // final method: cannot be overridden
    public final void sayHello() {
        System.out.println("Hello from FinalParent (final method)");
    }
}