package com.example.pkg2;

import com.example.pkg1.MyClass;

/**
 * OtherClass.java
 *
 * Demonstrates what is accessible across packages.
 */
public class OtherClass {

    public static void demo() {
        MyClass a = new MyClass();
        System.out.println("Inside com.example.pkg2 (different package):");
        a.publicMethod();          // OK - public
        // a.packagePrivateMethod(); // NOT allowed - package-private (compile error)
        // a.protectedMethod();      // NOT allowed here - protected not visible to non-subclasses in different package

        // But public field is accessible:
        System.out.println("public field: " + a.pub);

        // package-private field and protected field are not directly accessible from here:
        // System.out.println(a.pkgPrivate); // compile error
        // System.out.println(a.prot);       // compile error (protected accessible only to subclass)
        System.out.println();
    }
}