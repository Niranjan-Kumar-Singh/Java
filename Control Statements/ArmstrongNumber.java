import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int number = sc.nextInt();
        sc.close();

        int originalNumber = number;
        int temp = number;
        int digits = 0;

        // Count the number of digits
        while (temp != 0) {
            temp /= 10;
            digits++;
        }

        int sum = 0;
        temp = number; // Reset temp for calculation

        // Calculate sum of each digit raised to the power of digits
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        // Display result
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
