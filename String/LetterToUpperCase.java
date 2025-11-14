public class LetterToUpperCase {
    public static void main(String[] args) {
        String str = "hi, i am niranjan kumar singh";
        System.out.println(toUpperCase(str));
    }

    /**
     * Converts the first letter of every word to uppercase.
     * Words are detected based on whitespace characters (space, tab, newline, etc.).
     */
    public static String toUpperCase(String str) {
        // If the string is null or empty, return it as-is
        if (str == null || str.isEmpty()) return str;

        // StringBuilder is used for efficient string construction
        StringBuilder sb = new StringBuilder(str.length());

        // This flag indicates whether the current character
        // starts a new word (true = beginning of a word)
        boolean newWord = true;

        // Iterate over all characters in the string
        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            // If the character is whitespace (space, tab, newline...)
            // then it's a word boundary
            if (Character.isWhitespace(c)) {
                sb.append(c);    // keep whitespace as-is
                newWord = true; // next non-whitespace character begins a new word
            }

            // If this character starts a new word
            else if (newWord) {
                sb.append(Character.toUpperCase(c));  // capitalize the character
                newWord = false;                      // next characters belong to the same word
            }

            // Otherwise, just append the character without modification
            else {
                sb.append(c);
            }
        }

        // Return the fully processed string
        return sb.toString();
    }
}