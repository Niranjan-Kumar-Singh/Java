public class PrintSubArrays {
    public static void main(String[] args) {
        int numbers[] = {-2, -4, -6, -8, -10};
        System.out.println("Sub Array:");
        printSubArrays(numbers);
        System.out.println("Sum of Sub Array:");
        maxSubArraySum(numbers);
        int maxSum = maxSubArray(numbers);
        System.out.println(maxSum);
    }

    public static int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int maxSum = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i], sum + nums[i]);
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    public static void printSubArrays(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void maxSubArraySum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currentSum = 0;
                for (int k = i; k <= j; k++) {
                    currentSum += arr[k];
                }
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
                System.out.println(currentSum);
            }
            System.out.println();
        }
        System.out.println("Maximum sum: " + maxSum);
    }
}