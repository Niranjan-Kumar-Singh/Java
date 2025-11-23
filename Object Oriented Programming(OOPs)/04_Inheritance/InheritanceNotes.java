/**
 * InheritanceNotes.java
 *
 * Theory & Notes for Inheritance (keep in root of 04_Inheritance folder).
 * This file is comment-heavy and safe to compile. It serves as your
 * study/reference doc.
 *
 * -------------------------
 * What is Inheritance?
 * -------------------------
 * - Inheritance allows one class (child/derived) to acquire the properties
 * (fields)
 * and behaviors (methods) of another class (parent/base).
 *
 * - Keyword: 'extends' (class inheritance), 'implements' (interfaces).
 *
 * Benefits:
 * - Code reuse
 * - Logical classification (is-a relationship)
 * - Easier maintenance
 *
 * -------------------------
 * Types of Inheritance
 * -------------------------
 * 1. Single-level inheritance:
 * - A single child inherits from a single parent.
 * Example: Dog extends Animal
 *
 * 2. Multi-level inheritance:
 * - A chain of inheritance: GrandParent -> Parent -> Child
 * Example (conceptual): LivingThing -> Animal -> Dog
 *
 * 3. Hierarchical inheritance:
 * - Multiple children inherit from the same parent.
 * Example: Dog extends Animal, Cat extends Animal
 *
 * 4. Hybrid inheritance:
 * - Combination of two or more inheritance types. Java achieves this via
 * classes + interfaces.
 *
 * 5. Multiple inheritance (NOT allowed for classes in Java)
 * - Java does not allow a class to extend more than one class.
 * Reason: avoids the "Diamond Problem" and ambiguity in method resolution.
 *
 * -------------------------
 * Why Java disallows multiple inheritance of classes?
 * -------------------------
 * Consider: class A, class B both define method m(); class C extends A and B.
 * If A and B implement m() differently, which one should C inherit?
 * This ambiguity is called the Diamond Problem.
 *
 * Java avoids this by:
 * - Allowing a class to extend only one class (single inheritance)
 * - Allowing multiple interfaces (which declare method signatures), with
 * default methods added later,
 * but conflict resolution for default methods is handled explicitly by the
 * programmer.
 *
 * -------------------------
 * Interfaces vs Multiple Inheritance
 * -------------------------
 * - Interfaces let a class promise to implement behaviors, and a class can
 * implement many interfaces.
 * - Interfaces (from Java 8) may have 'default' methods (with body).
 * If two interfaces provide the same default method, the implementing class
 * must override it
 * to resolve the conflict — explicit resolution is required, so ambiguity is
 * managed.
 *
 * -------------------------
 * Method Overriding & super keyword
 * -------------------------
 * - A subclass can change the implementation of an inherited method (override
 * it).
 * - Use @Override annotation to make intent clear.
 * - Use 'super.method(...)' to call parent version from subclass if needed.
 *
 * -------------------------
 * Access control & inheritance
 * -------------------------
 * - private members of parent are NOT accessible to child directly.
 * - protected members are accessible in child classes (and package).
 * - public members are always accessible.
 *
 * -------------------------
 * Final notes / tips
 * -------------------------
 * - Prefer composition over inheritance when behavior is better expressed as
 * "has-a".
 * - Use inheritance when there is a clear "is-a" relationship.
 * - Keep inheritance trees shallow for maintainability.
 *
 * -------------------------
 * Where to run demos:
 * -------------------------
 * Compile inside folder:
 * javac *.java
 *
 * Run:
 * java SingleInheritance
 * java MultiLevelInheritance
 * java HierarchicalInheritance
 * java HybridInheritance
 *
 * -------------------------
 * End of InheritanceNotes
 * -------------------------
 */
public class InheritanceNotes {
    // intentionally empty - this file is documentation-only.
}