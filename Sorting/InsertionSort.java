import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        // Insertion Sort Example
        // ----------------------
        // We will sort this array in ascending order using Insertion Sort
        int arr[] = { 5, 4, 1, 3, 2 };

        System.out.println("Before Sorting: " + Arrays.toString(arr));
        insertionSorting(arr); // function call
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }

    /*
     * --------------------------- INSERTION SORT NOTES ---------------------------
     *
     * ➤ DEFINITION:
     * Insertion Sort builds the sorted array one element at a time.
     * It takes the current element and inserts it into the correct
     * position among the already *sorted* left part of the array.
     *
     * ➤ WORKING PRINCIPLE:
     * 1. Treat the first element as already sorted.
     * 2. Pick the next element (current).
     * 3. Compare it with elements in the sorted left part.
     * 4. Shift all elements greater than current to the right.
     * 5. Insert the current element at the correct position.
     *
     * Example (5,4,1,3,2):
     * Pass 1: (5) | 4 1 3 2 → insert 4 before 5 → (4,5)
     * Pass 2: (4,5) | 1 3 2 → insert 1 before 4 → (1,4,5)
     * Pass 3: (1,4,5) | 3 2 → insert 3 before 4 → (1,3,4,5)
     * Pass 4: (1,3,4,5) | 2 → insert 2 before 3 → (1,2,3,4,5)
     *
     * ➤ TIME COMPLEXITY:
     * Best Case : O(n) (when array is already sorted)
     * Average Case: O(n^2)
     * Worst Case : O(n^2)
     *
     * ➤ SPACE COMPLEXITY:
     * O(1) → In-place sorting (shifts inside same array)
     *
     * ➤ STABILITY:
     * ✅ YES, Insertion Sort is stable.
     *
     * ➤ WHEN TO USE?
     * ✔ Very good for small size arrays
     * ✔ Very efficient when array is already sorted or nearly sorted
     * ✔ Used in real applications (unlike bubble & selection sort)
     *
     * ➤ BEST AMONG SIMPLE SORTS?
     * ✅ YES! For small inputs, Insertion Sort is generally better than:
     * - Bubble Sort
     * - Selection Sort
     * because it adapts to partially sorted arrays.
     *
     * ---------------------------------------------------------------------------
     */

    public static void insertionSorting(int arr[]) {

        // Start from second element because first is already "sorted"
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i]; // current element to be inserted
            int prev = i - 1; // pointer to the sorted left side

            // Shift elements to right until correct position is found
            while (prev >= 0 && arr[prev] > current) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // Insert the current element at its correct position
            arr[prev + 1] = current;
        }
    }
}
