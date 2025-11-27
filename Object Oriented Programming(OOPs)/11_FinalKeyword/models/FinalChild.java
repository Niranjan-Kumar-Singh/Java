package models;

public class FinalChild extends FinalParent {
    // trying to override sayHello() would be a compile error:
    // public void sayHello() { ... }  // ❌ compile error

    public void extraMethod() {
        System.out.println("Child extra method");
    }
}