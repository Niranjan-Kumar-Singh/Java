import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {

        // Counting Sort Example (Non-comparison based sorting)
        int arr[] = { 1, 4, 1, 3, 2, 4, 3, 7 };

        System.out.println("Before Sorting: " + Arrays.toString(arr));
        countingSorting(arr); // function call
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }

    /*
     * ----------------------------- COUNTING SORT NOTES -----------------------------
     *
     * ➤ DEFINITION:
     * Counting Sort is a **non-comparison based** sorting algorithm.
     * Instead of comparing elements (like Bubble, Selection, Insertion),
     * it counts the frequency of each number and then rebuilds the sorted array.
     *
     * ➤ WHEN TO USE?
     * ✔ Works best when input values are small and non-negative (like marks, age, etc.)
     * ❌ Not good for large range values like (0 to 10^9)
     *
     * ➤ WORKING STEPS:
     * 1️⃣ Find the largest element in the array
     * 2️⃣ Create a frequency array (count array) of size largest+1
     * 3️⃣ Count occurrences of each number
     * 4️⃣ Rebuild the sorted array using count frequencies
     *
     * Example:
     * arr = [1,4,1,3,2,4,3]
     * count array = [0,2,1,2,2]  (index → number, value → frequency)
     * sorted = [1,1,2,3,3,4,4]
     *
     * ➤ TIME COMPLEXITY:
     * Best Case   : O(n + k)
     * Average     : O(n + k)
     * Worst Case  : O(n + k)
     * where k = largest element
     *
     * ➤ SPACE COMPLEXITY:
     * O(k) extra space (for frequency array)
     *
     * ➤ STABILITY:
     * ❌ This implementation is NOT stable (just counts and places elements)
     * ✅ But counting sort CAN be stable if prefix-sum (cumulative count)
     *    array is used (used in Radix Sort)
     *
     * ➤ USE CASES:
     * ✔ Marks / Grades / Age sorting
     * ✔ Limited range values
     * ✘ Not suitable when numbers are very large or negative
     *
     * ➤ COMPARISON BASED?
     * NO → Counting Sort does not compare elements!
     * It is faster than O(n log n) sorts **only when k is small**
     *
     * --------------------------------------------------------------------------------
     */

    public static void countingSorting(int arr[]) {

        // Step 1: Find largest element
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // Step 2: Create count array of size (largest + 1)
        int count[] = new int[largest + 1];

        // Step 3: Store frequencies
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Step 4: Build sorted array by placing elements from count array
        int j = 0; // index for original array
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
}
