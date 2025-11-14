/**
 * Q2_StringComparision
 *
 * This program demonstrates how String comparison works in Java.
 *
 * IMPORTANT NOTES:
 * ---------------------
 * 1. `equals()` compares **content** of two strings.
 *    - Returns true if sequences of characters match exactly.
 *
 * 2. `==` compares **memory reference** (NOT content).
 *    - Returns true only if both variables refer to the same object.
 *
 * 3. String comparison is case-sensitive:
 *       "Hello".equals("hello") → false
 *
 * 4. For case-insensitive comparison, use:
 *       str.equalsIgnoreCase(otherString)
 */
public class Q2_StringComparision {
    public static void main(String[] args) {

        String str  = "NiranjanKumarSingh";   // full string
        String str1 = "Niranjan";             // different content
        String str2 = "NiranjanKumarSingh";   // same content as str

        // equals() → checks CONTENT of strings
        System.out.println(
                str.equals(str1) + " " +    // false (content different)
                str.equals(str2)            // true  (content same)
        );
    }
}