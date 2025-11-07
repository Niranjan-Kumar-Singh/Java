public class MaxSubArraySum_PrefixSum {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10}; // Example input array
        maxSum(arr);
    }

    // Function to find the maximum subarray sum using Prefix Sum method
    public static void maxSum(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;  // To handle arrays with all negative values
        int prefixArr[] = new int[arr.length];

        // Step 1️⃣: Build the prefix sum array
        // prefixArr[i] stores sum of all elements from arr[0] to arr[i]
        prefixArr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixArr[i] = prefixArr[i - 1] + arr[i];
        }

        // Step 2️⃣: Iterate through all possible subarrays
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                // Step 3️⃣: Use prefix array to calculate subarray sum in O(1)
                // If subarray starts from index 0, take prefixArr[j]
                // Else, subtract prefixArr[i - 1] to exclude previous elements
                currSum = i == 0 ? prefixArr[j] : prefixArr[j] - prefixArr[i - 1];

                // Step 4️⃣: Update maxSum if current subarray sum is greater
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Maximum subarray sum: " + maxSum);
    }
}