import java.util.Arrays;

public class Q3_InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };

        System.out.println("Before Sorting: " + Arrays.toString(arr));
        insertionSorting(arr);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }

    public static void insertionSorting(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int prev = i - 1;

            while(prev >= 0 && arr[prev] < current) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = current;
        }
    }
}
