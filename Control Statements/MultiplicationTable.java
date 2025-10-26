import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = sc.nextInt();
        sc.close();

        System.out.println("\nMultiplication Table for " + number + ":");

        // Loop to generate multiplication table from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d x %2d = %3d%n", number, i, number * i);
        }
    }
}
