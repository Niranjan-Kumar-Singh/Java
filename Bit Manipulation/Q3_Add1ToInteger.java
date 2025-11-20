/**
 * Q3_Add1ToInteger.java
 *
 * This program adds 1 to an integer using Bit Manipulation.
 *
 * Trick:
 *   - The expression (-~x) gives (x + 1)
 *
 * Why it works?
 *   ~x  → bitwise NOT (flips all bits)
 *   -~x → negative of (~x)
 *
 *   Identity:
 *       -~x = x + 1
 *
 * Example:
 *   x = 5 → binary: 00000101
 *   ~x    →         11111010  (which is -6)
 *   -~x   → -(-6) = 6
 *
 * So, -~x gives the same result as x + 1.
 */
public class Q3_Add1ToInteger {
    public static void main(String[] args) {

        int x = 5;

        // Add 1 to x using bit manipulation trick
        int result = -~x;

        System.out.println(x + " + 1 is " + result);
    }
}