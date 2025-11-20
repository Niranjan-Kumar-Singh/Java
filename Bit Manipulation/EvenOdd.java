/**
 * EvenOdd.java
 *
 * This program checks whether a number is EVEN or ODD
 * using Bit Manipulation.
 *
 * IMPORTANT:
 *   - The last bit (LSB) of any integer determines odd/even.
 *   - If LSB = 0 → number is EVEN
 *   - If LSB = 1 → number is ODD
 *
 * Why?
 *   Binary rule:
 *       Even numbers end with 0  (e.g., 2 = 10, 4 = 100)
 *       Odd numbers end with 1   (e.g., 3 = 11, 5 = 101)
 *
 * Using bitwise AND:
 *       number & 1 → extracts the LAST BIT
 */
public class EvenOdd {
    public static void main(String[] args) {

        int num = 4;
        int bitMask = 1; // 0001

        /*
         ---------------------------------------------------
         Bit Trick:
             num & 1
             → If result is 0 → EVEN
             → If result is 1 → ODD

         Explanation:
             AND with 1 keeps only the LAST bit:
                 000...0001

             Example:
                 4 = 100 (binary)
                 4 & 1 = 0 → even

                 7 = 111 (binary)
                 7 & 1 = 1 → odd
         ---------------------------------------------------
         */

        if ( (num & bitMask) == 0 ) {
            System.out.println(num + " is EVEN");
        } else {
            System.out.println(num + " is ODD");
        }
    }
}