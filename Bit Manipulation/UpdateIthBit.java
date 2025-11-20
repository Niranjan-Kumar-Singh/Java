/**
 * UpdateIthBit.java
 *
 * This program updates (changes) the i-th bit of a number
 * to a new value (0 or 1) using Bit Manipulation.
 *
 * Concept:
 *   Updating a bit means:
 *      - First clear the i-th bit (make it 0)
 *      - Then OR it with the new bit shifted to position i
 *
 * Steps:
 *   Step 1: Clear i-th bit
 *       num = num & ~(1 << i)
 *
 *   Step 2: Create new bitmask with newBit at position i
 *       mask = newBit << i
 *
 *   Step 3: Set it using OR
 *       num = num | mask
 *
 * Example:
 *   number = 10 (1010)
 *   i = 2
 *   newBit = 1
 *
 *   Clear bit 2:
 *       1010 & 1011 = 1010
 *
 *   Set bit 2 to 1:
 *       1010 | 0100 = 1110 = 14
 */
public class UpdateIthBit {
    public static void main(String[] args) {

        int number = 10; // binary: 1010
        int i = 2;       // update 2nd bit
        int newBit = 1;  // new bit value (0 or 1)

        System.out.println("Original number: " + number);

        // Step 1: Clear the i-th bit
        number = clearIthBit(number, i);

        // Step 2: Create bitmask for new bit
        int bitMask = newBit << i;

        // Step 3: OR to set the new bit
        number = number | bitMask;

        System.out.println("Updated number: " + number);
    }

    /**
     * Clears (sets to 0) the i-th bit of a number.
     */
    public static int clearIthBit(int num, int i) {
        int bitMask = ~(1 << i);   // flip i-th bit to 0
        return num & bitMask;      // AND to clear bit
    }
}