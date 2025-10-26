import java.util.Scanner;

public class StarPattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the number of rows for the star pattern: ");
        int rows = scanner.nextInt();
        scanner.close();

        // Validate input
        if (rows <= 0) {
            System.out.println("Please enter a positive number greater than 0.");
            return;
        }

        // Print increasing star pattern (left-aligned triangle)
        System.out.println("Star Pattern:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

// Output example for 5 rows:
// Star Pattern:
// *
// * *
// * * *
// * * * *
// * * * * *