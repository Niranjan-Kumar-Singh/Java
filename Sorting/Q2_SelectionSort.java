import java.util.Arrays;

public class Q2_SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };

        System.out.println("Before Sorting: " + Arrays.toString(arr));
        selectionSorting(arr);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }

    public static void selectionSorting(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int max = i;
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[max] < arr[j]) {
                    max = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
    }
}
