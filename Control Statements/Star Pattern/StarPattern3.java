import java.util.Scanner;

public class StarPattern3 {
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

        // Upper half of the diamond (including middle row)
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Newline after each row
        }

        // Lower half of the diamond (excluding middle row)
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Newline after each row
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
// * * * *
// * * *
// * *
// *