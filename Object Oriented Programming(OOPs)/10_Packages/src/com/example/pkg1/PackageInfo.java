package com.example.pkg1;

/**
 * PackageInfo.java
 *
 * Small helper to demonstrate package-level access.
 * This class calls the package-private method of MyClass (allowed because same package).
 */
public class PackageInfo {

    public static void demo() {
        MyClass a = new MyClass();
        System.out.println("Inside com.example.pkg1:");
        a.publicMethod();
        a.packagePrivateMethod(); // OK - same package
        a.protectedMethod();      // OK - same package
        System.out.println();
    }
}