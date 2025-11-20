/**
 * PowerOf2OrNot.java
 *
 * This program checks whether a number is a power of 2
 * using Bit Manipulation.
 *
 * Concept:
 *   A number is a power of 2 only if:
 *      - It has exactly one bit set in its binary form.
 *
 *   Trick:
 *      number & (number - 1)
 *
 *   If this gives 0 → it is a power of 2.
 *
 * Example:
 *   4 = 100
 *   3 = 011
 *
 *   100 & 011 = 000  → power of 2
 *
 * Note:
 *   0 is NOT a power of 2, so handle separately.
 */
public class PowerOf2OrNot {
    public static void main(String[] args) {

        int number = 4;

        // Special case: 0 is never a power of 2
        if (number == 0) {
            System.out.println("No, " + number + " is not the power of 2");
            return;
        }

        // Power of 2 check using bit trick
        if ((number & (number - 1)) == 0) {
            System.out.println("Yes, " + number + " is the power of 2");
        } else {
            System.out.println("No, " + number + " is not the power of 2");
        }
    }
}