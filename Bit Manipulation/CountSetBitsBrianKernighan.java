/**
 * CountSetBitsBrian.java
 *
 * This program counts how many bits are set to 1
 * in the binary form of a number using Brian Kernighan's Algorithm.
 *
 * Concept:
 *   Each time we do: number = number & (number - 1)
 *   → It removes the rightmost set bit.
 *
 *   So the loop runs exactly as many times
 *   as there are set bits.
 *
 * Example:
 *   number = 15 → binary: 1111
 *
 *   Iterations:
 *      1111 & 1110 = 1110
 *      1110 & 1101 = 1100
 *      1100 & 1011 = 1000
 *      1000 & 0111 = 0000
 *
 *   Set bits = 4
 */
public class CountSetBitsBrianKernighan {
    public static void main(String[] args) {

        int number = 15;
        int count = 0;

        int temp = number; // store for printing later

        while (temp > 0) {
            temp = temp & (temp - 1); // removes the lowest set bit
            count++;
        }

        System.out.println("Number of set bits in " + number + " is: " + count);
    }
}