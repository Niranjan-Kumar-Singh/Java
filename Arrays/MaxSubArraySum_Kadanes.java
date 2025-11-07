public class MaxSubArraySum_Kadanes {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10}; // Example input array
        maxSum(arr);
    }

    // Function to find the maximum subarray sum using Kadane's Algorithm (O(n) time)
    public static void maxSum(int arr[]) {
        int maxSum = arr[0]; // Initialize with first element to handle all-negative arrays
        int currSum = arr[0];

        // Traverse the array from the 2nd element onward
        for (int i = 1; i < arr.length; i++) {

            // Step 1️⃣: Add current element or start a new subarray from current element
            currSum = Math.max(arr[i], currSum + arr[i]);

            // Step 2️⃣: Update global maxSum
            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println("Maximum subarray sum: " + maxSum);
    }
}