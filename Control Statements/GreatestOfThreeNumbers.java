import java.util.Scanner;

public class GreatestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        sc.close();

        // Check if all numbers are equal first
        if (num1 == num2 && num2 == num3) {
            System.out.println("All three numbers are equal.");
        }
        // Check which number is greatest
        else if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the greatest among " + num2 + " and " + num3 + ".");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the greatest among " + num1 + " and " + num3 + ".");
        } else {
            System.out.println(num3 + " is the greatest among " + num1 + " and " + num2 + ".");
        }
    }
}
