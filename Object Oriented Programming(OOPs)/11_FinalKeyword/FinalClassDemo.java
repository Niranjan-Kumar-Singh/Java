import models.FinalBox;

/**
 * FinalClassDemo.java
 *
 * Demonstrates final classes:
 *  - A final class cannot be subclassed (e.g., String is final)
 *
 * Compile & run:
 *   javac FinalClassDemo.java
 *   java FinalClassDemo
 */

public class FinalClassDemo {

    public static void main(String[] args) {
        FinalBox box = new FinalBox("box1");
        System.out.println(box);
        // Cannot inherit from FinalBox (uncommenting attempts below causes compile error)
        // class ExtendedBox extends FinalBox {} // ❌ compile error
    }
}