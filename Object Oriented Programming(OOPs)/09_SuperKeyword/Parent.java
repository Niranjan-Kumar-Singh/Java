/**
 * Parent.java
 *
 * Demonstrates parent properties and parent method
 * that will be accessed using `super` inside the Child class.
 */
public class Parent {

    public String name = "ParentClass";

    public void showMessage() {
        System.out.println("Message from Parent class");
    }

    public Parent() {
        System.out.println("Parent constructor called");
    }
}