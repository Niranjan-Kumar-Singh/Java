import java.util.Scanner;

public class StarPattern14 {

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

        // Print the cross star pattern (X shape)
        System.out.println("Star Pattern:");

        for (int i = 0; i < rows; i++) { // Loop for rows
            for (int j = 0; j < rows; j++) { // Loop for columns

                // Print star at main diagonal (i == j) or anti-diagonal (i + j == rows - 1)
                if (i == j || i + j == rows - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print space for alignment
                }
            }
            System.out.println(); // Move to next line
        }
    }
}

// Example output for input = 5:
// Star Pattern:
// *       *
//   *   *
//     *
//   *   *
// *       *