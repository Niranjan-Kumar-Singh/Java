/**
 * GetIthBit.java
 *
 * This program prints the i-th bit (0 or 1) of a given number
 * using Bit Manipulation.
 *
 * Concept:
 *   - Create a bitmask: (1 << i)
 *       Example for i = 2 → 0001 << 2 → 0100
 *
 *   - AND the number with the bitmask:
 *       If (number & bitMask) == 0 → i-th bit is 0
 *       Otherwise                → i-th bit is 1
 *
 * Bits are 0-indexed from the RIGHT (LSB):
 *
 *   Example:
 *       number = 13 → binary = 1101
 *
 *       index:   3 2 1 0
 *       bits :   1 1 0 1
 *
 *       i = 2  → bit is 1
 */
public class GetIthBit {
    public static void main(String[] args) {

        int number = 4; // binary: 100
        int i = 1;      // we want the 1st bit (from right)

        // Create a bitmask by shifting 1 left by i positions
        int bitMask = 1 << i; // e.g., i=1 → 0010

        /*
         ---------------------------------------------------
         If (number & bitMask) == 0:
              → the i-th bit is 0
         else
              → the i-th bit is 1
         ---------------------------------------------------
         */
        int ithBit = (number & bitMask) == 0 ? 0 : 1;

        System.out.println("The " + i + "th position bit of " + number + " is: " + ithBit);
    }
}