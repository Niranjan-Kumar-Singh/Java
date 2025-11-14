public class Substring {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(mySubstring(str, 0, 5));
        System.out.println(str.substring(0, 5)); // built-in method
    }

    /**
     * Creates a substring from index 'start' (inclusive)
     * to index 'end' (exclusive).
     *
     * @param str   the original string
     * @param start the starting index (inclusive)
     * @param end   the ending index (exclusive)
     * @return the substring from start to end-1
     */
    public static String mySubstring(String str, int start, int end) {
        StringBuilder subStr = new StringBuilder();

        for (int i = start; i < end; i++) {
            subStr.append(str.charAt(i));
        }

        return subStr.toString();
    }
}