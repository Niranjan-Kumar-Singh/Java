import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();
        sc.close();

        // Use StringBuilder for efficient string reversal
        StringBuilder reversed = new StringBuilder();

        // Append characters in reverse order
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        // Output the reversed string
        System.out.println("Reversed string: " + reversed.toString());
    }
}
