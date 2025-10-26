import java.util.Scanner;

public class StarPattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the number of rows for the star pattern: ");
        int rows = sc.nextInt();
        sc.close();

        // Validate input
        if (rows <= 0) {
            System.out.println("Please enter a positive number greater than 0.");
            return;
        }

        System.out.println("Star Pattern:");

        // Generate a hollow reverse pyramid
        for (int i = rows; i >= 1; i--) {
            // Print leading spaces to shift the stars to the right
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            // Print stars and spaces inside the row
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // Move to the next line
            System.out.println();
        }
    }
}

// Example output for input = 5:
// Star Pattern:
// *               *
//   *           *
//     *       *
//       *   *
//         *