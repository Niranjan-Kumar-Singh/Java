import java.util.Scanner;

public class NumberPattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows for the number pattern: ");
        int n = sc.nextInt();
        sc.close();

        // Validate the input (must be a positive integer)
        if (n <= 0) {
            System.out.println("Please enter a positive number greater than 0.");
            return; // Exit if invalid input
        }

        // Print the number pattern
        System.out.println("Number Pattern:");

        // Outer loop for each row
        for (int i = 1; i <= n; i++) {

            // Inner loop to print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Move to the next line after printing a row
            System.out.println();
        }
    }
}

// Example output for input = 5:
// Number Pattern:
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5