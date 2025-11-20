/**
 * SetIthBit.java
 *
 * This program sets the i-th bit of a number to 1
 * using Bit Manipulation.
 *
 * Concept:
 *   1 << i   → creates a bitmask with only the i-th bit = 1
 *   number | bitMask
 *          → sets the i-th bit to 1 (others remain unchanged)
 *
 * Example:
 *   number = 10 (1010 in binary)
 *   i = 2
 *
 *   bitMask = 1 << 2 → 0100
 *
 *   1010
 * | 0100
 * -------
 *   1110 = 14
 *
 * So the 2nd bit becomes 1.
 */
public class SetIthBit {
    public static void main(String[] args) {

        int number = 10;  // binary: 1010
        int i = 2;        // we want to set the 2nd bit

        // Create bitmask with 1 at the i-th position
        int bitMask = 1 << i;  // e.g., i=2 → 00000100

        // SET operation: OR with bitmask
        int updatedNumber = number | bitMask;

        System.out.println("Original number: " + number);
        System.out.println("After setting " + i + "th bit: " + updatedNumber);
    }
}