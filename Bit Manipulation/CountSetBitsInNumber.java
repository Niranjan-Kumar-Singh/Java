/**
 * CountSetBitsInNumber.java
 *
 * This program counts how many bits are set to 1
 * in the binary form of a number using Bit Manipulation.
 *
 * Concept:
 *   - Check the last bit using (number & 1)
 *   - If it is 1 → increase count
 *   - Right shift the number to check the next bit
 *
 * Example:
 *   number = 15 → binary: 1111
 *   Set bits = 4
 */
public class CountSetBitsInNumber {
    public static void main(String[] args) {

        int number = 15;
        int count = 0;

        int temp = number; // store original number to print later

        while (temp > 0) {

            // Check the last bit
            if ((temp & 1) == 1) {
                count++;
            }

            // Shift right to check next bit
            temp = temp >> 1;
        }

        System.out.println("Number of set bits in " + number + " is: " + count);
    }
}