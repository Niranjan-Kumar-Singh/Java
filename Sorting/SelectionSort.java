import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        // Selection Sort Example
        // ----------------------
        // We will sort this array in ascending order using Selection Sort
        int arr[] = { 5, 4, 1, 3, 2 };

        System.out.println("Before Sorting: " + Arrays.toString(arr));
        selectionSorting(arr);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }

    /*
     * --------------------------- SELECTION SORT NOTES ---------------------------
     *
     * ➤ DEFINITION:
     * Selection Sort is a comparison-based sorting algorithm.
     * In every pass, it selects the smallest element from the unsorted part
     * of the array and places it at its correct position in the sorted part.
     *
     * ➤ WORKING PRINCIPLE:
     * Assume the first element is the minimum.
     * Then compare it with all other elements to find the real minimum.
     * After finding the minimum → swap it with the first unsorted element.
     *
     * Example (5,4,1,3,2):
     * Pass 1 → smallest = 1 → swap with 5 → (1,4,5,3,2)
     * Pass 2 → smallest = 2 → swap with 4 → (1,2,5,3,4)
     * Pass 3 → smallest = 3 → swap with 5 → (1,2,3,5,4)
     * Pass 4 → smallest = 4 → swap with 5 → (1,2,3,4,5)
     * Now sorted ✔
     *
     * ➤ TIME COMPLEXITY:
     * Best Case : O(n^2) (no early stopping possible)
     * Average Case: O(n^2)
     * Worst Case : O(n^2)
     *
     * ➤ SPACE COMPLEXITY:
     * O(1) → In-place sorting (no extra array used)
     *
     * ➤ STABILITY:
     * ❌ NOT stable
     * Because selection sort may change the relative order of equal elements
     *
     * ➤ WHEN TO USE?
     * ✔ Works well for small datasets
     * ✔ Easier to understand
     * ❌ Not good for large datasets
     * ❌ Always O(n^2), no best-case improvement
     *
     * ➤ KEY DIFFERENCE FROM BUBBLE SORT
     * Bubble Sort → repeatedly swaps adjacent elements
     * Selection Sort → finds min first, then swaps only ONCE per pass
     *
     * ---------------------------------------------------------------------------
     */

    public static void selectionSorting(int arr[]) {

        // Traverse the array
        for (int i = 0; i < arr.length - 1; i++) {

            int min = i; // Assume current index is minimum

            // Find index of actual minimum value in remaining array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            // Swap the found min element with the first unsorted element
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
