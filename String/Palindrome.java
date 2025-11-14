public class Palindrome {
    public static void main(String[] args) {
        String word = "racecar";

        if (isPalindrome(word)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }

    /**
     * Checks whether a given string is a palindrome.
     * A palindrome reads the same forward and backward.
     *
     * Example: "racecar", "level", "madam"
     *
     * @param str the string to check
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindrome(String str) {
        int n = str.length();

        // Compare characters from start and end moving inwards
        for (int i = 0; i < n / 2; i++) {
            // If characters don't match, it's not a palindrome
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }

        // If all mirrored characters matched, it's a palindrome
        return true;
    }
}