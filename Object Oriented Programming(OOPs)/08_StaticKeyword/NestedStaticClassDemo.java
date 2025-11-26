/**
 * NestedStaticClassDemo.java
 *
 * Demonstrates static nested classes (a class declared static inside another).
 *
 * Key points:
 *  - Static nested class does not require an instance of the outer class.
 *  - It's often used to group related helper classes or builders.
 *
 * Run:
 *   javac NestedStaticClassDemo.java
 *   java NestedStaticClassDemo
 */
public class NestedStaticClassDemo {

    static class Outer {
        private static String info = "Outer static info";

        // static nested class
        public static class Helper {
            public void help() {
                System.out.println("Helper accessing: " + Outer.info);
            }
        }
    }

    public static void main(String[] args) {
        // create nested class instance without Outer instance
        Outer.Helper helper = new Outer.Helper();
        helper.help();
    }
}