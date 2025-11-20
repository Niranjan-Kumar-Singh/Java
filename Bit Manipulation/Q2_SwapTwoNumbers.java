/**
 * Q2_SwapTwoNumbers.java
 *
 * This program swaps two numbers using the XOR operation.
 *
 * Concept:
 *   XOR has a special property:
 *
 *       a ^ b ^ b = a   (because b ^ b = 0)
 *       a ^ b ^ a = b   (because a ^ a = 0)
 *
 *   Steps:
 *     x = x ^ y;
 *     y = x ^ y;
 *     x = x ^ y;
 *
 *   After these operations, x and y get swapped
 *   without using a temporary variable.
 */
public class Q2_SwapTwoNumbers {
    public static void main(String[] args) {

        int x = 3;
        int y = 4;
        System.out.println("Before swapping: " + x + " and " + y);

        // XOR Swap Algorithm
        x = x ^ y;  // Step 1
        y = x ^ y;  // Step 2
        x = x ^ y;  // Step 3

        System.out.println("After swapping: " + x + " and " + y);
    }
}