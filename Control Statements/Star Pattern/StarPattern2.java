import java.util.Scanner;

public class StarPattern2 {
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

        // Print decreasing star pattern
        System.out.println("Star Pattern:");
        for (int i = rows; i >= 1; i--) {
            // Print stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

// Output example for 5 rows:
// Star Pattern:
// * * * * *
// * * * *
// * * *
// * *
// *