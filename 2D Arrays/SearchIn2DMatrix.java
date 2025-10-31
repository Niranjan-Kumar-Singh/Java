/*
 * Program: Search an Element in a Sorted 2D Matrix
 * ------------------------------------------------
 * Given a 2D matrix where:
 *   - Each row is sorted in ascending order (left → right)
 *   - Each column is sorted in ascending order (top → bottom)
 *
 * The task is to efficiently find whether a given key exists in the matrix.
 *
 * Example:
 *   Matrix:
 *      10  20  30  40
 *      15  25  35  45
 *      27  29  37  48
 *      32  33  39  50
 *
 *   Key = 33
 *
 *   Output: Element found at [3, 1]
 *
 * ------------------------------------------------
 * 🧩 Approach: Staircase Search (O(n + m))
 * ------------------------------------------------
 * 1️⃣ Start from the **top-right corner** of the matrix.
 * 2️⃣ Compare the current element with the key:
 *      - If it's equal → key found ✅
 *      - If key > current element → move **down** (increase row)
 *      - If key < current element → move **left** (decrease column)
 * 3️⃣ Repeat until the element is found or boundaries are crossed.
 *
 * ------------------------------------------------
 * ⏱️ Time Complexity: O(n + m)
 * 💾 Space Complexity: O(1)
 */

public class SearchIn2DMatrix {

    public static void main(String[] args) {
        // Example matrix (sorted both row-wise and column-wise)
        int[][] matrix = {
            { 10,  20,  30,  40 },
            { 15,  25,  35,  45 },
            { 27,  29,  37,  48 },
            { 32,  33,  39,  50 }
        };

        int key = 33;

        stairCaseSearch(matrix, key);
    }

    /**
     * Performs Staircase Search to find the key in a sorted 2D matrix.
     *
     * @param matrix The 2D matrix sorted row-wise and column-wise.
     * @param key The integer value to search for.
     * @return true if the key is found; false otherwise.
     */
    public static boolean stairCaseSearch(int[][] matrix, int key) {
        // Start from the top-right corner
        int row = 0;
        int column = matrix[0].length - 1;

        // Traverse while within the matrix boundaries
        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] == key) {
                System.out.println("Element found at: [" + row + ", " + column + "]");
                return true;
            } else if (key > matrix[row][column]) {
                // Move down to a larger element
                row++;
            } else {
                // Move left to a smaller element
                column--;
            }
        }

        // If we exit the loop, key is not present
        System.out.println("Element not present in the matrix.");
        return false;
    }
}
