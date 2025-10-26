import java.util.Scanner;

public class NumberPattern3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows for the number pattern: ");
        int n = sc.nextInt();
        sc.close();

        // Validate input: must be positive
        if (n <= 0) {
            System.out.println("Please enter a positive number greater than 0.");
            return; // Exit if invalid
        }

        // Initialize the number to start from
        int number = 1;

        // Print the number pattern
        System.out.println("Number Pattern:");

        // Loop through each row
        for (int i = 1; i <= n; i++) {

            // Print numbers in the row from left to right
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++; // Increment the number for next print
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}

// Example output for input = 5:
// Number Pattern:
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15