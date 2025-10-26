import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to check if it is a palindrome: ");
        int number = sc.nextInt();
        sc.close();

        int originalNumber = number;      // Store original number for comparison
        int reversedNumber = 0;

        // Reverse the number
        while (number != 0) {
            int digit = number % 10;                  // Extract the last digit
            reversedNumber = reversedNumber * 10 + digit; // Build the reversed number
            number /= 10;                             // Remove the last digit
        }

        // Check and display whether it's a palindrome
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome number.");
        } else {
            System.out.println(originalNumber + " is not a palindrome number.");
        }
    }
}
