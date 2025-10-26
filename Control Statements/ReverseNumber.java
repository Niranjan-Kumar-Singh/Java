import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number to reverse: ");
        int number = sc.nextInt();
        sc.close();

        int originalNumber = number; // Store original number for better output clarity
        int reversedNumber = 0;

        // Loop to reverse the digits of the number
        while (number != 0) {
            int digit = number % 10;                 // Extract the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append digit to the reversed number
            number /= 10;                            // Remove the last digit
        }

        // Display the result
        System.out.println("Reversed number of " + originalNumber + " is: " + reversedNumber);
    }
}
