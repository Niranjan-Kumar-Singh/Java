/**
 * Calculator.java
 *
 * Demonstrates Method Overloading (Compile-time Polymorphism).
 */
public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public float sum(float a, float b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public float sum(float a, float b, float c) {
        return a + b + c;
    }
}