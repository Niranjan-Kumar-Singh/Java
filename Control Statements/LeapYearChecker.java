import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year to check if it's a leap year: ");
        int year = sc.nextInt();
        sc.close();

        boolean isLeapYear;

        // Leap year logic:
        // Divisible by 4 ➜ Might be leap
        // Divisible by 100 ➜ Not a leap year unless divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }

        // Print result
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
