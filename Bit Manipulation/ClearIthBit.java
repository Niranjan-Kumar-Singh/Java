/**
 * ClearIthBit.java
 *
 * This program clears (sets to 0) the i-th bit of a number
 * using Bit Manipulation.
 *
 * Concept:
 *   - To clear a bit, we use AND with a bitmask where
 *     the i-th bit is 0 and all other bits are 1.
 *
 * Step-by-step:
 *   1) Create a mask with 1 at the i-th position:
 *          (1 << i)
 *
 *   2) Negate it (~) so the i-th bit becomes 0 and
 *      all other bits become 1.
 *
 *      Example (i = 2):
 *        1 << 2  = 0100
 *        ~(0100) = 1011   ← this clears bit 2
 *
 *   3) AND the number with this mask:
 *          number & mask
 *
 * Example:
 *   number = 13 (1101)
 *   i = 2
 *
 *   1101
 * & 1011
 * -------
 *   1001 = 9
 *
 */
public class ClearIthBit {
    public static void main(String[] args) {

        int number = 13;   // binary: 1101
        int i = 2;         // clear 2nd bit

        // Step 1 & 2: Create mask with 0 at i-th bit
        int bitMask = ~(1 << i);  // ~(0100) = 1011

        // Step 3: Clear bit using AND
        int updatedNumber = number & bitMask;

        System.out.println("Original number: " + number);
        System.out.println("After clearing " + i + "th bit: " + updatedNumber);
    }
}