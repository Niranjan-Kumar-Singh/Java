import java.util.Scanner;

public class StarPattern15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter number of rows
        System.out.print("Enter the number of rows for the star pattern: ");
        int rows = sc.nextInt();
        sc.close();

        // Validate input (must be positive)
        if (rows <= 0) {
            System.out.println("Please enter a positive number greater than 0.");
            return;
        }

        // Print the star pattern
        System.out.println("Star Pattern:");

        // Outer loop for each row
        for (int i = 0; i < rows; i++) {
            // Inner loop for each column
            for (int j = 0; j < rows; j++) {

                // Print star if we're on the border
                if (i == 0 || i == rows - 1 || j == 0 || j == rows - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print space inside the square
                }
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}

// Example output for input = 5:
// Star Pattern:
// * * * * *
// *       *
// *       *
// *       *
// * * * * *