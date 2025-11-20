/**
 * Q4_ConvertUppercaseToLowercase.java
 *
 * This program converts an uppercase character
 * to lowercase using Bit Manipulation.
 *
 * Concept:
 *   Uppercase and lowercase letters differ by one bit.
 *
 *   Bit to set: 0010 0000  (decimal 32)
 *
 *   lowercase = uppercase | 32
 */
public class Q4_ConvertUppercaseToLowercase {
    public static void main(String[] args) {

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            char lower = (char)(ch | 32);  // convert to lowercase
            System.out.print(lower);
        }
    }
}
