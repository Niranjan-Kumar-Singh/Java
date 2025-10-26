import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to check if it is prime: ");
        int number = sc.nextInt();
        sc.close();

        // Display result based on the prime check
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) return false;              // 0, 1 and negative numbers are not prime
        if (num == 2) return true;               // 2 is the only even prime number
        if (num % 2 == 0) return false;          // Eliminate even numbers

        // Check divisibility from 3 to √num, skipping even numbers
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
