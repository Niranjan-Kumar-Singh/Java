import java.util.Scanner;

public class StarPattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the number of rows for the star pattern: ");
        int rows = sc.nextInt();
        sc.close();

        // Validate input
        if (rows <= 0) {
            System.out.println("Please enter a positive number greater than 0.");
            return;
        }

        // Print the pattern
        System.out.println("Star Pattern:");

        // Outer loop for rows (descending)
        for (int i = rows; i >= 1; i--) {
            // Print leading spaces for right alignment
            for (int j = i; j < rows; j++) {
                System.out.print("  "); // Two spaces for each gap
            }

            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to next line after each row
            System.out.println();
        }
    }
}

// Output example for 5 rows:
// Star Pattern:
// * * * * *
//   * * * *
//     * * *
//       * *
//         *