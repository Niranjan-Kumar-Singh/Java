import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        // Bubble Sort
        // ---------------------------------------
        // We will sort this array in ascending order using Bubble Sort
        int arr[] = { 5, 4, 1, 3, 2 };

        System.out.println("Before Sorting: " + Arrays.toString(arr));
        bubbleSorting(arr); // calling bubble sort function
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }

    /*
     * ----------------------------- BUBBLE SORT NOTES -----------------------------
     *
     * ➤ DEFINITION:
     * Bubble Sort is a simple comparison-based sorting algorithm.
     * It repeatedly compares adjacent elements and swaps them if they are in
     * the wrong order. After every pass, the largest element "bubbles" to
     * the end of the array.
     *
     * ➤ WORKING PRINCIPLE:
     * 1. Compare two adjacent elements
     * 2. If arr[j] > arr[j+1] → swap them
     * 3. After 1 full pass, largest element reaches the last position
     * 4. Repeat this process for remaining elements
     *
     * ➤ WHY OPTIMIZATION IS USED?
     * If during any pass, no swapping happens, this means the array is already
     * sorted → So we can STOP EARLY (best case O(n) time).
     *
     * ➤ TIME COMPLEXITY:
     * Best Case : O(n) (when array already sorted, due to swapped flag)
     * Average Case: O(n^2)
     * Worst Case : O(n^2) (when array is reverse sorted)
     *
     * ➤ SPACE COMPLEXITY:
     * O(1) → In-place sorting (only one temp variable used)
     *
     * ➤ STABILITY:
     * YES ✅ Bubble Sort is a stable sorting algorithm.
     * (relative order of equal values remains same)
     *
     * ➤ WHEN TO USE?
     * ✔ Good for: Teaching, Understanding sorting basics
     * ✘ Not good for large data / performance heavy tasks
     *
     * -----------------------------------------------------------------------------
     */

    public static void bubbleSorting(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {

            boolean swapped = false; // To track if any swap happened in this iteration

            // Last i elements are already at correct position
            for (int j = 0; j < arr.length - 1 - i; j++) {

                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {

                    // Swap if they are in wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true; // swapping happened
                }
            }

            // If no swapping = array already sorted → break early
            if (!swapped) {
                break;
            }
        }
    }
}
