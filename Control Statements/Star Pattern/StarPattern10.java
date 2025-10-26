import java.util.Scanner;

public class StarPattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter number of rows
        System.out.print("Enter the number of rows for the star pattern: ");
        int rows = sc.nextInt();
        sc.close();

        // Validate input
        if (rows <= 0) {
            System.out.println("Please enter a number greater than 0.");
            return;
        }

        System.out.println("Star Pattern:");

        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Loop through each column
            for (int j = 1; j <= i; j++) {
                if (j < i) {
                    System.out.print("  "); // Print space for alignment
                } else {
                    System.out.print("* "); // Print star at diagonal
                }
            }
            // Move to next line
            System.out.println();
        }
    }
}

// Example output for input = 5:
// Star Pattern:
// *
//   *
//     *
//       *
//         *