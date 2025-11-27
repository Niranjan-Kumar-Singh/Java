package com.example.pkg1;

/**
 * MyClass.java
 *
 * This class is part of package: com.example.pkg1
 *
 * - publicMethod(): accessible everywhere
 * - packagePrivateMethod(): accessible only inside the same package (no modifier)
 * - protectedMethod(): accessible in same package and in subclasses (even in other packages)
 */
public class MyClass {

    public String pub = "public-field-pkg1";
    String pkgPrivate = "package-private-field-pkg1"; // default, package-private
    protected String prot = "protected-field-pkg1";

    public MyClass() {}

    public void publicMethod() {
        System.out.println("MyClass.publicMethod()");
    }

    void packagePrivateMethod() {
        System.out.println("MyClass.packagePrivateMethod() (package-private)");
    }

    protected void protectedMethod() {
        System.out.println("MyClass.protectedMethod()");
    }
}