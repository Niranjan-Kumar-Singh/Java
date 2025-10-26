import java.util.Scanner;

public class NumberPattern6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows for the number pattern: ");
        int rows = sc.nextInt();
        sc.close();

        // Validate the input (must be positive)
        if (rows <= 0) {
            System.out.println("Please enter a positive number greater than 0.");
            return; // Exit the program if input is invalid
        }

        // Print the number pattern
        System.out.println("Number Pattern:");

        // Outer loop for each row, starting from 'rows' down to 1
        for (int i = rows; i >= 1; i--) {

            // Inner loop to print numbers from 'i' down to 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}

// Example output for input = 5:
// Number Pattern:
// 5 4 3 2 1
// 4 3 2 1
// 3 2 1
// 2 1
// 1