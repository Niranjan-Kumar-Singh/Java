/**
 * Oops.java
 *
 * MASTER THEORY FILE for "Object Oriented Programming (OOPs)".
 * Save this file in the project root: Object Oriented Programming(OOPs)/Oops.java
 *
 * This file contains clear, compact, beginner-friendly theory for all OOP topics.
 * All content is in comments so this file is safe to compile and serve as a single
 * reference. Use the demo files in subfolders to see the code examples run.
 *
 * ---------------------------
 * Table of Contents (topics)
 * ---------------------------
 * 1.  Classes & Objects
 * 2.  Access Modifiers
 * 3.  Getters & Setters
 * 4.  Encapsulation
 * 5.  Constructors
 * 6.  Types of Constructors
 * 7.  Copy Constructor
 * 8.  Shallow & Deep Copy
 * 9.  Destructors (GC in Java)
 * 10. Inheritance (overview)
 * 11. Single-level Inheritance
 * 12. Multi-level Inheritance
 * 13. Hierarchical Inheritance
 * 14. Hybrid Inheritance (how Java handles it)
 * 15. Polymorphism (overview)
 * 16. Method Overloading (compile-time)
 * 17. Method Overriding (runtime)
 * 18. Packages in Java
 * 19. Abstraction
 * 20. Abstract Classes
 * 21. Interfaces
 * 22. Static keyword
 * 23. Super keyword
 *
 * -------------------------------------------------------------------------
 * 1. Classes & Objects
 * -------------------------------------------------------------------------
 * Class:
 *   - A blueprint or template describing objects.
 *   - Declares fields (state) and methods (behavior).
 *
 *   Syntax:
 *     class Pen {
 *         String color;
 *         int tip;
 *
 *         void write() { ... }
 *     }
 *
 * Object:
 *   - An instance of a class created using 'new'.
 *     Pen p = new Pen();
 *
 * Difference:
 *   - Class = design. Object = concrete item in memory (heap).
 *
 * -------------------------------------------------------------------------
 * 2. Access Modifiers
 * -------------------------------------------------------------------------
 * Four types:
 *   - public: accessible everywhere
 *   - private: accessible only inside the same class
 *   - protected: accessible in same package and subclasses
 *   - default (package-private): no modifier; accessible only in same package
 *
 * Quick rules:
 *   - Use private fields + public getters/setters (encapsulation).
 *   - protected useful for inheritance.
 *
 * -------------------------------------------------------------------------
 * 3. Getters & Setters
 * -------------------------------------------------------------------------
 * Purpose:
 *   - Control access to fields (validate before setting, compute derived values)
 *
 * Example:
 *   private int age;
 *   public void setAge(int a) {
 *       if (a >= 0) age = a;
 *   }
 *   public int getAge() { return age; }
 *
 * -------------------------------------------------------------------------
 * 4. Encapsulation
 * -------------------------------------------------------------------------
 * Idea:
 *   - Hide internal data (private) and expose a controlled API (public methods).
 *
 * Benefits:
 *   - Better maintenance, validation, and security.
 *
 * Example:
 *   BankAccount with private password, public setPassword() that validates length.
 *
 * -------------------------------------------------------------------------
 * 5. Constructors
 * -------------------------------------------------------------------------
 * - Special method that runs when object is created.
 * - Name = class name, no return type.
 * - Default constructor (no arguments) provided by compiler if none exists.
 *
 * Example:
 *   public Student() { this.name = "unknown"; }
 *   public Student(String name, int age) { this.name = name; this.age = age; }
 *
 * -------------------------------------------------------------------------
 * 6. Types of Constructors
 * -------------------------------------------------------------------------
 * - Default constructor: no-arg; created by compiler if none given.
 * - Parameterized constructor: takes arguments to initialize fields.
 * - Copy constructor: creates new object copying fields from another object.
 *
 * -------------------------------------------------------------------------
 * 7. Copy Constructor
 * -------------------------------------------------------------------------
 * Java doesn't auto-create a "copy constructor" like C++. But we can write:
 *
 *   public MyClass(MyClass other) {
 *       this.field = other.field;
 *       this.arr = other.arr; // shallow copy
 *   }
 *
 * Use copy constructors to clone state. Decide shallow vs deep copy depending on fields.
 *
 * -------------------------------------------------------------------------
 * 8. Shallow & Deep Copy
 * -------------------------------------------------------------------------
 * - Shallow copy: copies primitive fields and references to objects (both objects share nested references)
 * - Deep copy: fully duplicates nested objects (changes to one do not affect the other)
 *
 * When to deep copy:
 *   - When the object owns mutable data (arrays, lists) and you don't want changes to reflect back.
 *
 * -------------------------------------------------------------------------
 * 9. Destructors (Garbage Collection in Java)
 * -------------------------------------------------------------------------
 * - Java has no user-defined destructors like C++.
 * - Garbage Collector (GC) reclaims unused objects automatically.
 * - finalizer (protected void finalize()) is deprecated and unreliable.
 * - Use try-with-resources or close() for resources (files, sockets).
 *
 * -------------------------------------------------------------------------
 * 10. Inheritance (overview)
 * -------------------------------------------------------------------------
 * - Mechanism to reuse code: class B extends A.
 * - Subclass B inherits fields/methods of A (except private).
 * - Use 'extends' keyword.
 *
 * Example:
 *   class Animal { void sound() {} }
 *   class Dog extends Animal { @Override void sound() { bark } }
 *
 * -------------------------------------------------------------------------
 * 11. Single-level Inheritance
 * -------------------------------------------------------------------------
 * - One child directly extends one parent.
 * - Example: Dog extends Animal
 *
 * -------------------------------------------------------------------------
 * 12. Multi-level Inheritance
 * -------------------------------------------------------------------------
 * - Chain of inheritance: GrandParent -> Parent -> Child
 * - Example: Animal -> Mammal -> Dog
 *
 * -------------------------------------------------------------------------
 * 13. Hierarchical Inheritance
 * -------------------------------------------------------------------------
 * - Multiple classes extend the same parent.
 * - Example: Dog extends Animal; Cat extends Animal
 *
 * -------------------------------------------------------------------------
 * 14. Hybrid Inheritance
 * -------------------------------------------------------------------------
 * - Combination of two or more types (single + multiple) — Java does NOT support multiple class inheritance.
 * - Use interfaces to achieve hybrid behaviour.
 *
 * -------------------------------------------------------------------------
 * 15. Polymorphism (overview)
 * -------------------------------------------------------------------------
 * - "Many forms" — same method name behaves differently.
 * - Two kinds: compile-time (overloading) and runtime (overriding).
 * - Runtime polymorphism uses method overriding + dynamic method dispatch.
 *
 * -------------------------------------------------------------------------
 * 16. Method Overloading (compile-time polymorphism)
 * -------------------------------------------------------------------------
 * - Same method name in same class with different parameter lists (type/count/order).
 *
 * Example:
 *   void add(int a,int b)
 *   void add(double a,double b)
 *
 * -------------------------------------------------------------------------
 * 17. Method Overriding (runtime polymorphism)
 * -------------------------------------------------------------------------
 * - Subclass provides its own implementation of superclass method.
 * - Use @Override annotation (recommended).
 * - Called via superclass reference to subclass object:
 *
 *   Animal a = new Dog(); a.sound(); // Dog.sound()
 *
 * -------------------------------------------------------------------------
 * 18. Packages in Java
 * -------------------------------------------------------------------------
 * - Packages group related classes (like folders in filesystem).
 * - Declared with "package com.example.oops;" at top.
 * - Compile with `javac -d out src/...java`
 * - Run with `java -cp out com.example.oops.Main`
 *
 * -------------------------------------------------------------------------
 * 19. Abstraction
 * -------------------------------------------------------------------------
 * - Hides implementation details; shows only essential features.
 * - Achieved using abstract classes and interfaces.
 *
 * -------------------------------------------------------------------------
 * 20. Abstract Classes
 * -------------------------------------------------------------------------
 * - Use `abstract` keyword. Can have both abstract methods (no body) and concrete methods.
 * - Cannot instantiate abstract classes.
 *
 * Example:
 *   abstract class Shape { abstract double area(); }
 *
 * -------------------------------------------------------------------------
 * 21. Interfaces
 * -------------------------------------------------------------------------
 * - Pure abstraction (before Java 8); now can have default and static methods.
 * - A class implements interface(s) using `implements`.
 * - Supports multiple inheritance of type (a class can implement many interfaces).
 *
 * -------------------------------------------------------------------------
 * 22. static keyword
 * -------------------------------------------------------------------------
 * - static members belong to the class, not to instances.
 * - Use for constants and utility methods. Example: Math.PI
 *
 * -------------------------------------------------------------------------
 * 23. super keyword
 * -------------------------------------------------------------------------
 * - `super` calls parent constructor or parent method.
 * - Example: super(name); or super.show();
 *
 * -------------------------------------------------------------------------
 * QUICK TIPS & INTERVIEW-LIKE NOTES
 * -------------------------------------------------------------------------
 * Q: Why use getters/setters rather than public fields?
 * A: Validation, future changes, read-only fields, encapsulation.
 *
 * Q: When to use abstract class vs interface?
 * A: Use interface when you need multiple types and only method contracts; use abstract class when you want shared code and state.
 *
 * Q: What is composition?
 * A: "Has-a" relationship. Prefer composition over inheritance when possible.
 *
 * -------------------------------------------------------------------------
 * END OF Oops.java (theory master file)
 * -------------------------------------------------------------------------
 */
public class Oops {
    // intentionally empty - this file is a documentation file.
    // Keep it in the root to be your single theory reference.
}
