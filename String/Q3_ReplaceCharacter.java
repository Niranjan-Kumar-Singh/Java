/**
 * Q3_ReplaceCharacter
 *
 * This program demonstrates how to replace characters in a String using
 * the replace() method of the String class.
 *
 * IMPORTANT NOTES:
 * --------------------------------------------------
 * 1. String.replace(char oldChar, char newChar)
 *    - Replaces ALL occurrences of oldChar with newChar.
 *    - Returns a NEW string (because String is immutable in Java).
 *
 * 2. Strings are immutable:
 *    - Original string does NOT change.
 *    - A new modified string is returned.
 *
 * 3. Method is case-sensitive:
 *    - 't' and 'T' are treated as different characters.
 *
 * 4. Other replace methods:
 *      replace(CharSequence old, CharSequence new) → replaces substrings
 *      replaceAll(regex, replacement) → regex based replacement
 *      replaceFirst(regex, replacement) → replace first match
 */
public class Q3_ReplaceCharacter {
    public static void main(String[] args) {

        // Original string
        String str = "Elitte College of Engineering";

        // Replace all 't' with 'a'
        // Only lowercase 't' will be replaced (case-sensitive)
        String newStr = str.replace('t', 'a');

        // Print modified string
        System.out.println(newStr);
    }
}