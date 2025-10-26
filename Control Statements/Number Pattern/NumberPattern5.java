import java.util.Scanner;

public class NumberPattern5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows for the number pattern: ");
        int n = sc.nextInt();
        sc.close();

        // Validate the input (must be a positive number)
        if (n <= 0) {
            System.out.println("Please enter a positive number greater than 0.");
            return; // Exit the program if input is invalid
        }

        // Print the number pattern
        System.out.println("Number Pattern:");

        // Loop through each row
        for (int i = 1; i <= n; i++) {
            
            // Print increasing numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Print decreasing numbers from i-1 down to 1
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}

// Example output for input = 5:
// Number Pattern:
// 1
// 1 2 1
// 1 2 3 2 1
// 1 2 3 4 3 2 1
// 1 2 3 4 5 4 3 2 1