import java.util.Scanner;

public class NumberPattern7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows for the number pattern: ");
        int rows = sc.nextInt();
        sc.close();

        // Validate the input (must be positive)
        if (rows <= 0) {
            System.out.println("Please enter a positive number greater than 0.");
            return; // Exit the program
        }

        // Print the number pattern
        System.out.println("Number Pattern:");

        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
            int currentNumber = rows - 1;       // Starts from the total number of rows
            int numberToPrint = i;          // Starts from the current row number

            // Inner loop for each column in the current row
            for (int j = 1; j <= i; j++) {
                System.out.print(numberToPrint + " ");  // Print the current number
                numberToPrint += currentNumber;     // Update number for next column
                currentNumber--;                        // Decrease the base for increment
            }

            // Move to the next line after completing a row
            System.out.println();
        }
    }
}

// Example output for input = 5:
// Number Pattern:
// 1
// 2 6
// 3 7 10
// 4 8 11 13
// 5 9 12 14 15