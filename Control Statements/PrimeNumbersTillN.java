import java.util.Scanner;

public class PrimeNumbersTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number N to find all prime numbers up to N: ");
        int N = sc.nextInt();
        sc.close();

        System.out.println("Prime numbers up to " + N + " are:");

        // Loop from 2 to N (1 is not a prime number)
        for (int number = 2; number <= N; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    // Method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        // Check divisibility only up to square root of num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
