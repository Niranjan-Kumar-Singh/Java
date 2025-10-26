import java.util.Scanner;

public class NumberPattern2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows for the number pattern: ");
        int n = sc.nextInt();
        sc.close();

        // Validate the input (should be a positive number)
        if (n <= 0) {
            System.out.println("Please enter a positive number greater than 0.");
            return; // Exit the program if input is invalid
        }

        // Print the number pattern
        System.out.println("Number Pattern:");

        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Inner loop to print the current row number 'i', 'i' times
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            // Move to the next line after printing one row
            System.out.println();
        }
    }
}

// Example output for input = 5:
// Number Pattern:
// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5