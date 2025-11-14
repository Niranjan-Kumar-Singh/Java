public class StringCompression {
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(compressString(str)); // Output: a3b2c3d2
    }

    /**
     * Compresses a string by replacing consecutive repeated characters
     * with the character followed by the number of repetitions.
     * Example: "aaabbcccdd" → "a3b2c3d2"
     */
    public static String compressString(String str) {

        // StringBuffer is thread-safe; StringBuilder is faster but both work.
        StringBuffer sb = new StringBuffer();

        // Loop through the string
        for (int i = 0; i < str.length(); i++) {

            // Each new character starts with count 1 (it occurs at least once)
            int count = 1;

            // Count how many times the same character repeats consecutively
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++; // Increase count when next char is the same
                i++;     // Move to the next character
            }

            // Append the character
            sb.append(str.charAt(i));

            // Append the count only if greater than 1
            // (Single characters like 'a' remain as 'a')
            if (count > 1) {
                sb.append(count);
            }
        }

        // Return the compressed string
        return sb.toString();
    }
}