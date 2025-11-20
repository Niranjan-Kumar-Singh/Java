/**
 * UpdateRangeOfBits.java
 *
 * This program updates (changes) all bits from index i to j
 * to a new bit value (0 or 1) using Bit Manipulation.
 *
 * Concept:
 *   To update a range of bits:
 *
 *     Step 1: Clear bits from i to j
 *     Step 2: Create a mask of the new bit value for that range
 *     Step 3: OR the number with that mask
 *
 * Example:
 *   number = 10 (1010)
 *   i = 2
 *   j = 4
 *   newBit = 1
 *
 *   Bits 2, 3, 4 will be updated to 1.
 */
public class UpdateRangeOfBits {

    public static void main(String[] args) {

        int number = 10;  // binary: 1010
        int i = 2;        // start index
        int j = 4;        // end index
        int newBit = 1;   // new bit value (0 or 1)

        System.out.println("Original number: " + number);

        int updated = updateBitsInRange(number, i, j, newBit);

        System.out.println("Updated number: " + updated);
    }

    /**
     * Updates bits from index i to j (inclusive) to newBit (0 or 1).
     */
    public static int updateBitsInRange(int num, int i, int j, int newBit) {

        // Validate new bit
        if (newBit != 0 && newBit != 1) {
            throw new IllegalArgumentException("newBit must be 0 or 1.");
        }

        // Edge Case 1: Bit positions must be valid
        if (i < 0 || j < 0 || i > 31 || j > 31) {
            throw new IllegalArgumentException("Bit positions must be between 0 and 31.");
        }

        // Edge Case 2: i must be ≤ j
        if (i > j) {
            throw new IllegalArgumentException("i should be less than or equal to j.");
        }

        // -------------------------
        // Step 1: Clear range i..j
        // -------------------------

        // leftMask: 1s above j
        int leftMask = (j == 31) ? 0 : (~0 << (j + 1));

        // rightMask: 1s below i
        int rightMask = (i == 0) ? 0 : ((1 << i) - 1);

        // mask with 0s from i..j
        int clearMask = leftMask | rightMask;

        // clearing the bits
        num = num & clearMask;

        // -------------------------
        // Step 2: Set new bits
        // -------------------------

        // create mask for the range (all 1s in i..j)
        int onesMask = ((j == 31) ? -1 : ((1 << (j + 1)) - 1)) ^
                       ((i == 0) ? 0 : ((1 << i) - 1));

        // shift newBit into range if newBit = 1, else mask becomes 0
        int newBitsMask = (newBit == 1) ? onesMask : 0;

        // -------------------------
        // Step 3: OR to set new bits
        // -------------------------
        return num | newBitsMask;
    }
}