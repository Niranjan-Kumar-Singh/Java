package com.example.app;

import com.example.pkg1.PackageInfo;
import com.example.pkg2.OtherClass;
import com.example.pkg2.SubClassInPkg2;

/**
 * PackageDemo.java
 *
 * Main demo showing package usage, compilation, and access rules.
 *
 * How to compile & run (PowerShell, from project root '10_Packages'):
 *
 *   # compile (creates 'out' directory)
 *   javac -d out src\com\example\app\PackageDemo.java
 *
 *   # run
 *   java -cp out com.example.app.PackageDemo
 *
 * Note: -d out compiles all required classes referenced by PackageDemo and places .class files under out\com\example\...
 */
public class PackageDemo {
    public static void main(String[] args) {
        System.out.println("=== Package demo starting ===\n");

        // Calls helper inside same package group (pkg1)
        PackageInfo.demo();

        // Access from different package
        OtherClass.demo();

        // Subclass in different package test
        SubClassInPkg2.demo();

        System.out.println("=== Package demo finished ===");
    }
}