import java.util.Arrays;

public class InbuiltSort {
    public static void main(String[] args) {

        // Inbuilt Sort Example (Java)
        // ---------------------------
        int arr[] = { 5, 4, 1, 3, 2 };

        System.out.println("Before Sorting: " + Arrays.toString(arr));
        Arrays.sort(arr); // Default full array sort
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }

    /*
     * -------------------------- INBUILT SORT NOTES ----------------------------
     *
     * ➤ WHAT IS Arrays.sort()?
     * Arrays.sort() is an inbuilt utility method in Java (inside java.util)
     * used to sort arrays in ascending order.
     *
     * -------------------------------------------------------------------------
     * ➤ INTERNAL WORKING:
     *
     * ✅ For PRIMITIVE types (int, char, double, etc.)
     * → Uses **Dual-Pivot QuickSort**
     * → Fast & efficient but ❌ NOT stable
     *
     * ✅ For OBJECT types (String, Integer, custom objects, etc.)
     * → Uses **Timsort** (Hybrid of Merge + Insertion Sort)
     * → Stable & faster for real-world data
     *
     * Why two algorithms?
     * - Primitive values don’t need stability → QuickSort faster
     * - Object values often require stable ordering → Timsort better
     *
     * -------------------------------------------------------------------------
     * ➤ TIME COMPLEXITY:
     * Best Case : O(n) (when nearly/already sorted → timsort)
     * Average : O(n log n)
     * Worst Case : O(n log n)
     *
     * ➤ SPACE COMPLEXITY:
     * - QuickSort → O(log n) recursion
     * - Timsort → O(n) extra space
     *
     * ➤ STABILITY:
     * - Primitive sorting → ❌ Not stable
     * - Object sorting → ✅ Stable
     *
     * -------------------------------------------------------------------------
     * ➤ OVERLOADED VERSIONS OF Arrays.sort()
     *
     * 1️⃣ Arrays.sort(int[] arr)
     * → Sorts entire primitive array
     *
     * 2️⃣ Arrays.sort(int[] arr, int fromIndex, int toIndex)
     * → Sorts partial/selected range of primitive array
     *
     * 3️⃣ Arrays.sort(Object[] arr)
     * → Sorts entire object/reference type array
     *
     * 4️⃣ Arrays.sort(Object[] arr, int fromIndex, int toIndex)
     * → Partial sort for object arrays
     *
     * 5️⃣ Arrays.sort(T[] arr, Comparator<? super T> c)
     * → Custom sorting logic using Comparator
     *
     * 6️⃣ Arrays.sort(T[] arr, int fromIndex, int toIndex, Comparator<? super T> c)
     * → Custom comparator + range based sorting
     *
     * -------------------------------------------------------------------------
     * ➤ EXAMPLES OF USAGE:
     * Arrays.sort(arr); // Full array
     * Arrays.sort(arr, 1, 4); // Sorts arr[1] to arr[3]
     * Arrays.sort(objArr); // Sorting objects
     * Arrays.sort(objArr, comparator); // Custom sorting logic
     *
     * -------------------------------------------------------------------------
     * ➤ WHY USE INBUILT SORT?
     * ✔ Faster than manual sorting
     * ✔ Production-ready & optimized
     * ✔ Handles all data types
     * ✔ Supports custom comparator
     *
     * -------------------------------------------------------------------------
     */
}
