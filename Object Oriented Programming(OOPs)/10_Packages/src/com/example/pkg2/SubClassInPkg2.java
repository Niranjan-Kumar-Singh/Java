package com.example.pkg2;

import com.example.pkg1.MyClass;

/**
 * SubClassInPkg2.java
 *
 * Demonstrates that a subclass in a different package can access:
 *  - public members
 *  - protected members (through inheritance)
 *
 * It CANNOT access package-private members of the parent.
 */
public class SubClassInPkg2 extends MyClass {

    public static void demo() {
        SubClassInPkg2 s = new SubClassInPkg2();
        System.out.println("Inside subclass in different package (com.example.pkg2):");
        s.publicMethod();         // OK
        s.protectedMethod();      // OK - protected accessible via inheritance
        // s.packagePrivateMethod(); // NOT allowed - package-private of pkg1

        System.out.println("protected field via inheritance: " + s.prot);
        System.out.println();
    }
}