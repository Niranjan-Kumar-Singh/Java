import java.util.Scanner;

public class StarPattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows for the star pattern: ");
        int rows = sc.nextInt();
        sc.close();

        // Input validation
        if (rows <= 0) {
            System.out.println("Please enter a positive number greater than 0.");
            return;
        }

        System.out.println("Star Pattern:");

        // Loop through each row (starting from top)
        for (int i = rows; i >= 1; i--) {
            // Print leading spaces to center-align the pyramid
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  "); // Two spaces for proper alignment
            }

            // Print stars in decreasing odd counts: 2*i - 1
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }

            // Move to next line after each row
            System.out.println();
        }
    }
}

// Example output for input = 5:
// Star Pattern:
// * * * * * * * * *
//   * * * * * * *
//     * * * * *
//       * * *
//         *