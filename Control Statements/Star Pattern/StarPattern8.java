import java.util.Scanner;

public class StarPattern8 {
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

        // Loop to generate each row of the pyramid
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces for center alignment
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  "); // Two spaces for alignment
            }

            // Print stars: increasing odd count (1, 3, 5, ...)
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}

// Example output for input = 5:
// Star Pattern:
//         * 
//       * * * 
//     * * * * * 
//   * * * * * * * 
// * * * * * * * * * 