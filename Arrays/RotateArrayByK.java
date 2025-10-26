import java.util.Arrays;

public class RotateArrayByK {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        System.out.println("Original Array: " + Arrays.toString(nums));
        int k = 5;
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        System.out.println("Rotated Array: " + Arrays.toString(nums));
    }

    public static void reverse(int nums[], int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
