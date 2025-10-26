import java.util.Scanner;

public class NumberPattern8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows for the number pattern: ");
        int totalRows = scanner.nextInt();
        scanner.close();

        // Validate the input (must be positive)
        if (totalRows <= 0) {
            System.out.println("Please enter a positive number greater than 0.");
            return;
        }

        int currentNumber = 0; // Tracks the next number to print

        // Generate and print the number pattern
        System.out.println("Number Pattern:");
        for (int row = 1; row <= totalRows; row++) {
            if (row % 2 != 0) {
                // For odd rows, print numbers in increasing order
                for (int i = 1; i <= 3; i++) {
                    currentNumber++;
                    System.out.print(currentNumber + " ");
                }
            } else {
                // For even rows, print numbers in reverse order
                int start = currentNumber + 1;
                int end = currentNumber + 3;
                for (int i = end; i >= start; i--) {
                    System.out.print(i + " ");
                    currentNumber++;
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}

// Example output for input = 5:
// Number Pattern:
// 1 2 3
// 6 5 4
// 7 8 9
// 12 11 10
// 13 14 15