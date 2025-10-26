import java.util.Scanner;

public class StarPattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows for the star pattern: ");
        int rows = sc.nextInt();
        sc.close();

        // Validate input
        if (rows <= 0) {
            System.out.println("Please enter a positive number greater than 0.");
            return;
        }

        System.out.println("Star Pattern:");

        // Loop to generate each row
        for (int i = rows; i >= 1; i--) {
            // Loop to print spaces and star
            for (int j = 1; j <= i; j++) {
                if (j < i) {
                    System.out.print("  "); // Print space for alignment
                } else {
                    System.out.print("* "); // Print star at diagonal
                }
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}

// Example output for input = 5:
// Star Pattern:
//         *
//       *
//     *
//   *
// *