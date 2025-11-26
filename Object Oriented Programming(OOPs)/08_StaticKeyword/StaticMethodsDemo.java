/**
 * StaticMethodsDemo.java
 *
 * Demonstrates static methods:
 *  - can be called without creating an instance
 *  - cannot access instance variables directly
 *
 * Run:
 *   javac StaticMethodsDemo.java
 *   java StaticMethodsDemo
 */
public class StaticMethodsDemo {

    static class MathUtil {
        // static method: utility method
        public static int square(int x) {
            return x * x;
        }

        // non-static method
        public int cube(int x) {
            return x * x * x;
        }
    }

    public static void main(String[] args) {
        // call static method without object
        System.out.println("square(5) = " + MathUtil.square(5));

        // call non-static method needs object
        MathUtil util = new MathUtil();
        System.out.println("cube(3) = " + util.cube(3));

        // static methods are commonly used for utility/helper functions (Math, Arrays, Collections)
    }
}