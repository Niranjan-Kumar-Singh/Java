public class SpiralMatrix {

    public static void main(String[] args) {
        int matrix[][] = {
                { 1,  2,  3,  4  },
                { 5,  6,  7,  8  },
                { 9,  10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        printSpiral(matrix);
    }

    /*
     * ----------------------- SPIRAL MATRIX TRAVERSAL NOTES -----------------------
     *
     * ➤ Goal:
     *   Print the matrix in a spiral form → top row → right column →
     *   bottom row → left column → then move inward
     *
     * ➤ Boundaries used:
     *   startRow : starting row index of current boundary
     *   endRow   : ending row index of current boundary
     *   startCol : starting column index of current boundary
     *   endCol   : ending column index of current boundary
     *
     * ➤ Steps in each spiral layer:
     *    1. Print TOP row    (left → right)
     *    2. Print RIGHT col  (top → bottom)
     *    3. Print BOTTOM row (right → left)       [only if startRow < endRow]
     *    4. Print LEFT col   (bottom → top)       [only if startCol < endCol]
     *
     * ➤ Why extra conditions?
     *    To avoid double printing when matrix has:
     *     - A single remaining row  (startRow == endRow)
     *     - A single remaining column (startCol == endCol)
     *
     * ➤ Time Complexity  : O(n * m)
     * ➤ Space Complexity : O(1)   (constant extra space)
     *
     * ---------------------------------------------------------------------------
     */

    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow   = matrix.length - 1;
        int endCol   = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // 1️⃣ Print the top boundary (left → right)
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // 2️⃣ Print the right boundary (top → bottom)
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // 3️⃣ Print the bottom boundary (right → left)
            // ✅ Only if we still have more than 1 row
            if (startRow < endRow) {
                for (int j = endCol - 1; j >= startCol; j--) {
                    System.out.print(matrix[endRow][j] + " ");
                }
            }

            // 4️⃣ Print the left boundary (bottom → top)
            // ✅ Only if we still have more than 1 column
            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--) {
                    System.out.print(matrix[i][startCol] + " ");
                }
            }

            // Move to the next inner layer
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }
}
