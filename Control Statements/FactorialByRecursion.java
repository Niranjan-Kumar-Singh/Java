import java.util.Scanner;

public class FactorialByRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer to calculate its factorial: ");
        int number = sc.nextInt();
        sc.close();

        // Validate input
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        long result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    // Recursive method to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        }
        return n * factorial(n - 1); // Recursive call
    }
}
