/**
 * FastExponential.java
 *
 * This program calculates a^n using Binary Exponentiation.
 *
 * Concept:
 *   Instead of multiplying 'a' n times,
 *   we use the binary form of n.
 *
 *   If (n & 1) == 1  → multiply ans by a
 *   Then square a
 *   Then right shift n (n = n >> 1)
 *
 * Example:
 *   a = 5, n = 3 (binary: 11)
 *
 *   Step 1: last bit = 1 → ans = ans * 5
 *   Step 2: square a → a = 25
 *   Step 3: shift n → 1
 *
 *   Step 4: last bit = 1 → ans = ans * 25
 */
public class FastExponential {
    public static void main(String[] args) {

        int a = 5;   // base
        int n = 3;   // power
        int ans = 1; // result starts at 1

        int tempN = n; // store original n if needed for printing

        while (tempN > 0) {

            // If the last bit is 1, multiply the current result
            if ((tempN & 1) == 1) {
                ans = ans * a;
            }

            // Square the base for the next bit
            a = a * a;

            // Move to the next bit of n
            tempN = tempN >> 1;
        }

        System.out.println("Result: " + ans);
    }
}