import java.util.Scanner;

/**
 * Q1_CountLowerCase
 *
 * This program counts the number of lowercase vowels (a, e, i, o, u)
 * in a given input string.
 *
 * Notes:
 * - Only lowercase vowels are counted.
 * - Characters are checked one by one.
 * - str.charAt(i) is O(1), so loop is O(n).
 * - Scanner is closed at the end to avoid resource leaks.
 */
public class Q1_CountLowerCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int count = 0;

        // Iterate through every character in the string
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);   // extract character once

            // Check if it is a lowercase vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Count of lowercase vowels: " + count);

        sc.close();
    }
}