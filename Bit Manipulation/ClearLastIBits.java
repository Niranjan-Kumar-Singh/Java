/**
 * ClearLastIBits.java
 *
 * This program clears (sets to 0) the LAST i bits of a number
 * using Bit Manipulation.
 *
 * Concept:
 *   To clear the last i bits:
 *
 *       number & (mask)
 *
 *   Where mask = (-1) << i
 *
 *   Because:
 *     -1 in binary (32-bit) is: 111111...111 (all 1s)
 *     Shifting left by i bits:
 *         (-1 << i)
 *
 *   Example (i = 2):
 *       -1   = 11111111 11111111 11111111 11111111
 *       << 2 = 11111111 11111111 11111111 11111100
 *
 *   That mask clears the last 2 bits.
 *
 * Example:
 *   number = 15 → binary 1111
 *   i = 2
 *
 *   mask = (-1 << 2) = 11111100
 *
 *       1111  (15)
 *   &   1100
 *   ----------
 *       1100 → 12
 */
public class ClearLastIBits {
    public static void main(String[] args) {

        int number = 15; // binary: 1111
        int i = 2;       // number of bits to clear

        System.out.println("Original number: " + number);

        // Create mask to clear last i bits
        int bitMask = (-1) << i;

        // Clear last i bits using AND
        int updatedNumber = number & bitMask;

        System.out.println("After clearing last " + i + " bits: " + updatedNumber);
    }
}