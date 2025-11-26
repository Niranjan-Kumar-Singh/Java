/**
 * Child.java
 *
 * Demonstrates:
 *  - Using super to access parent variables
 *  - Using super to call parent methods
 *  - Constructor chaining using super()
 */
public class Child extends Parent {

    public String name = "ChildClass";

    public Child() {
        super(); // calls Parent constructor
        System.out.println("Child constructor called");
    }

    public void printNames() {
        System.out.println("Child name: " + name);
        System.out.println("Parent name: " + super.name);
    }

    public void showMessages() {
        super.showMessage(); // calling parent method
        System.out.println("Message from Child class");
    }
}