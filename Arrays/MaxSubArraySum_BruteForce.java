public class MaxSubArraySum_BruteForce {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10}; // Example input array
        maxSum(arr);
    }

    // Function to find the maximum subarray sum using brute force
    public static void maxSum(int arr[]) {
        int currSum = 0;                        // To store sum of current subarray
        int maxSum = Integer.MIN_VALUE;         // Initialize with smallest integer value

        // Outer loop: start index of subarray
        for (int i = 0; i < arr.length; i++) {
            // Inner loop: end index of subarray
            for (int j = i; j < arr.length; j++) {
                currSum = 0;

                // Loop to calculate the sum of the current subarray (from i to j)
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                }

                // Print all subarray sums (for understanding)
                System.out.println("Subarray (" + i + ", " + j + ") sum = " + currSum);

                // Update maxSum if current subarray sum is greater
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Maximum subarray sum: " + maxSum);
    }
}