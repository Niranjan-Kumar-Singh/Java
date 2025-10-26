public class Q2_SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        
        System.out.println("The element is present in index: " + search(nums, target));
    }

    public static int search(int nums[], int target) {
        int n = nums.length;
        int left = 0;
        int right = n-1;

        while (left < right) {
            int mid = (left + right) / 2;
            
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else if (nums[mid] < nums[right]) {
                right = mid;
            }
        }

        int shift = left;

        left = 0;
        right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int realMid = (mid + shift) % n;

            if (nums[realMid] == target) {
                return realMid;
            } else if (nums[realMid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}