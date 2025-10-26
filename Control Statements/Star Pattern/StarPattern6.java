import java.util.Scanner;

public class StarPattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user input
        System.out.print("Enter the number of rows for the star pattern: ");
        int rows = sc.nextInt();
        sc.close();

        // Input validation
        if (rows <= 0) {
            System.out.println("Please enter a positive number greater than 0.");
            return;
        }

        System.out.println("Star Pattern:");

        // Upper part of the diamond pattern
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = i; j < rows; j++) {
                System.out.print("  "); // Two spaces for alignment
            }

            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Newline after each row
            System.out.println();
        }

        // Lower part of the diamond pattern
        for (int i = rows - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = rows; j > i; j--) {
                System.out.print("  "); // Two spaces for alignment
            }

            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Newline after each row
            System.out.println();
        }
    }
}

// Output example for 5 rows:
// Star Pattern:
//         *
//       * *
//     * * *
//   * * * *
// * * * * *
//   * * * *
//     * * *
//       * *
//         *