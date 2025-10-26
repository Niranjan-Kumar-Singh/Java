import java.util.Scanner;

public class StarPattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the number of rows for the star pattern: ");
        int rows = sc.nextInt();
        sc.close();

        // Input validation
        if (rows <= 0) {
            System.out.println("Please enter a positive number greater than 0.");
            return;
        }

        System.out.println("Star Pattern:");

        // Generate a left-aligned pyramid pattern
        for (int i = 1; i <= rows; i++) {

            // Print leading spaces for center alignment
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");  // Single space for alignment
            }

            // Print stars with space
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}

// Output example for 5 rows:
// Star Pattern:
//     *
//    * *
//   * * *
//  * * * *
// * * * * *