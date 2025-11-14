import java.util.Arrays;

/**
 * Q4_Anagrams
 *
 * This program checks whether two strings are anagrams of each other.
 *
 * ---------------------------------------------------------
 * What is an Anagram?
 * ---------------------------------------------------------
 * Two strings are anagrams if:
 *   ✔ They contain the same characters
 *   ✔ Characters appear the same number of times
 *   ✔ Order of characters does NOT matter
 *
 * Example:
 *   "earth" ↔ "heart"
 *   "listen" ↔ "silent"
 *
 * ---------------------------------------------------------
 * Approach Used:
 * ---------------------------------------------------------
 * 1. Convert both strings to lowercase.
 * 2. Check if their lengths are equal.
 *    - If lengths differ → not anagrams.
 * 3. Convert strings to char arrays.
 * 4. Sort both char arrays.
 *    - If two sorted arrays match → they are anagrams.
 * 5. Use Arrays.equals() for comparison.
 *
 * ---------------------------------------------------------
 * Why Sorting Works?
 * ---------------------------------------------------------
 * Sorting puts characters in a fixed order.
 *
 * Example:
 *   "earth" → a e h r t
 *   "heart" → a e h r t
 *
 * Sorted arrays match → they are anagrams.
 *
 * ---------------------------------------------------------
 * Time Complexity:
 *   Sorting takes O(n log n)
 *   Converting to char array is O(n)
 *   Comparing arrays is O(n)
 * ---------------------------------------------------------
 */

public class Q4_Anagrams {
    public static void main(String[] args) {

        String str1 = "earth";
        String str2 = "heart";

        // Step 1: Convert to lowercase to ensure case-insensitive comparison
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Step 2: Quick length check — if different, they cannot be anagrams
        if (str1.length() == str2.length()) {

            // Step 3: Convert both strings to character arrays
            char[] str1CharArr = str1.toCharArray();
            char[] str2CharArr = str2.toCharArray();

            // Step 4: Sort both character arrays
            Arrays.sort(str1CharArr);
            Arrays.sort(str2CharArr);

            // Step 5: Compare sorted arrays
            boolean result = Arrays.equals(str1CharArr, str2CharArr);

            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
            }

        } else {
            // If lengths differ → not anagrams
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
        }
    }
}