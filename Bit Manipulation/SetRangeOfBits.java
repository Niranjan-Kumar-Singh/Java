/**
 * SetRangeOfBits.java
 *
 * This program sets (changes to 1) all bits from index i to j
 * in a number using Bit Manipulation.
 *
 * Concept:
 *   To set a range of bits:
 *     - Create a mask that has 1s from i to j
 *     - OR the number with that mask
 *
 * How the mask is created:
 *   Step 1: mask1 → 1s from 0 to j
 *       mask1 = (1 << (j + 1)) - 1
 *
 *   Step 2: mask2 → 1s from 0 to i-1
 *       mask2 = (1 << i) - 1
 *
 *   Final mask:
 *       mask = mask1 ^ mask2
 *       (this gives 1s only in the i..j range)
 *
 * Example:
 *   number = 10 (1010)
 *   i = 2
 *   j = 4
 *
 *   Bits 2, 3, 4 will be set.
 */
public class SetRangeOfBits {

    public static void main(String[] args) {

        int number = 10;  // binary: 1010
        int i = 2;        // start index
        int j = 4;        // end index

        System.out.println("Original number: " + number);

        int updated = setBitsInRange(number, i, j);

        System.out.println("Updated number: " + updated);
    }

    /**
     * Sets all bits from index i to j (inclusive).
     */
    public static int setBitsInRange(int num, int i, int j) {

        // Edge Case 1: Bit positions must be valid
        if (i < 0 || j < 0 || i > 31 || j > 31) {
            throw new IllegalArgumentException("Bit positions must be between 0 and 31.");
        }

        // Edge Case 2: i must be ≤ j
        if (i > j) {
            throw new IllegalArgumentException("i should be less than or equal to j.");
        }

        // Step 1: mask with 1s from 0 to j
        // Edge Case: j == 31 → shifting by 32 is invalid → handle separately
        int mask1 = (j == 31) ? -1 : ((1 << (j + 1)) - 1);

        // Step 2: mask with 1s from 0 to i-1
        // Edge Case: i == 0 → no lower bits
        int mask2 = (i == 0) ? 0 : ((1 << i) - 1);

        // Final mask: 1s only in the range i..j
        int mask = mask1 ^ mask2;

        // OR operation sets the bits in that range
        return num | mask;
    }
}