/**
 * ClearRangeOfBits.java
 *
 * This program clears (sets to 0) all bits from index i to j
 * in a number using Bit Manipulation.
 *
 * Concept:
 *   To clear a range of bits:
 *     - Make a mask with 0s from i to j
 *     - AND the number with that mask
 *
 * Mask Creation:
 *   Left side mask → 1s above j
 *       leftMask = (~0 << (j + 1))
 *
 *   Right side mask → 1s below i
 *       rightMask = (1 << i) - 1
 *
 *   Final mask:
 *       mask = leftMask | rightMask
 *
 * Example:
 *   number = 10 (1010)
 *   i = 2
 *   j = 4
 *
 *   Bits 2, 3, 4 will be cleared.
 */
public class ClearRangeOfBits {

    public static void main(String[] args) {

        int number = 10;  // binary: 1010
        int i = 2;        // start index
        int j = 4;        // end index

        System.out.println("Original number: " + number);

        int updated = clearBitsInRange(number, i, j);

        System.out.println("Updated number: " + updated);
    }

    /**
     * Clears bits from index i to j (inclusive).
     */
    public static int clearBitsInRange(int num, int i, int j) {

        // Edge Case 1: Invalid bit positions
        if (i < 0 || j < 0 || i > 31 || j > 31) {
            throw new IllegalArgumentException("Bit positions must be between 0 and 31.");
        }

        // Edge Case 2: Wrong ordering
        if (i > j) {
            throw new IllegalArgumentException("i should be less than or equal to j.");
        }

        // Edge Case 3: When j == 31, there are no bits above 31 → leftMask = 0
        int leftMask = (j == 31) ? 0 : (~0 << (j + 1));

        // Edge Case 4: When i == 0, no bits on the right side → rightMask = 0
        int rightMask = (i == 0) ? 0 : ((1 << i) - 1);

        // Final mask: 1s everywhere except 0s from i..j
        int mask = leftMask | rightMask;

        // AND with mask clears the range
        return num & mask;
    }
}