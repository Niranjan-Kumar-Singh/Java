/*
 * Program: Diagonal Sum of a Square Matrix
 * ---------------------------------------
 * This program calculates the sum of the primary and secondary diagonals
 * of a square matrix.
 *
 * 💡 Problem Understanding:
 *   In a square matrix:
 *     - Primary diagonal elements are those where row index == column index → (i == j)
 *     - Secondary diagonal elements are those where row index + column index = n - 1 → (i + j == n - 1)
 *
 * Example:
 *   Matrix:
 *      1   2   3   4
 *      5   6   7   8
 *      9  10  11  12
 *     13  14  15  16
 *
 *   Primary Diagonal Elements:   1, 6, 11, 16
 *   Secondary Diagonal Elements: 4, 7, 10, 13
 *   Total Sum = 68
 *
 * -------------------------------------------------------------
 * 🧩 Brute Force Approach (O(n²)):
 * -------------------------------------------------------------
 *   1. Use nested loops to traverse every element.
 *   2. Check conditions:
 *        if (i == j)  → primary diagonal
 *        if (i + j == n - 1) → secondary diagonal
 *   3. Add matching elements to the sum.
 *
 *   ❌ Time Complexity: O(n²)
 *   ✅ Space Complexity: O(1)
 *
 * -------------------------------------------------------------
 * ⚡ Optimized Approach (O(n)):
 * -------------------------------------------------------------
 *   1. Loop only once (i = 0 to n-1)
 *   2. Directly add:
 *        ➤ matrix[i][i]              → primary diagonal
 *        ➤ matrix[i][n - 1 - i]      → secondary diagonal
 *   3. Avoid double-counting the center element (for odd n).
 *
 *   ✅ Time Complexity: O(n)
 *   ✅ Space Complexity: O(1)
 */

public class DiagonalSum {

    public static void main(String[] args) {
        // Example 4x4 matrix
        int[][] matrix = {
            { 1,  2,  3,  4 },
            { 5,  6,  7,  8 },
            { 9, 10, 11, 12 },
            {13, 14, 15, 16 }
        };

        // Call method to calculate diagonal sum
        diagonalSum(matrix);
    }

    /**
     * Calculates and prints the sum of both diagonals of a square matrix.
     *
     * @param matrix 2D square integer array
     */
    public static void diagonalSum(int[][] matrix) {
        int n = matrix.length;
        int sum = 0;

        /*
         * --------------------------------------------------------
         * 🧩 Brute Force Approach (for reference):
         * --------------------------------------------------------
         *
         * int sum = 0;
         * for (int i = 0; i < matrix.length; i++) {
         *     for (int j = 0; j < matrix[0].length; j++) {
         *         if (i == j) {
         *             sum += matrix[i][j];               // Primary Diagonal
         *         } else if (i + j == matrix.length - 1) {
         *             sum += matrix[i][j];               // Secondary Diagonal
         *         }
         *     }
         * }
         */

        // --------------------------------------------------------
        // ⚡ Optimized Approach (Active Code)
        // --------------------------------------------------------
        for (int i = 0; i < n; i++) {
            // Primary diagonal element
            sum += matrix[i][i];

            // Secondary diagonal element
            if (i != n - 1 - i) {
                sum += matrix[i][n - 1 - i];
            }
        }

        // Print the result
        System.out.println("Sum of both diagonals: " + sum);
    }
}
