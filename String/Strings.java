import java.util.Arrays;
import java.util.Scanner;

/**
 * Strings.java
 * Author: Niranjan
 */
public class Strings {

    public static void main(String[] args) {
        // ---------- CREATION & IMMUTABILITY ----------
        // String literals are interned (stored in the String pool).
        String literal = "abcd";                 // created in string pool
        System.out.println("literal = " + literal);

        // Using the constructor always creates a new object on the heap (not pooled by default).
        String constructed = new String("xyz@123");
        System.out.println("constructed = " + constructed);

        // Strings are immutable: methods return new Strings, original never changes.
        String original = "immutable";
        String upper = original.toUpperCase(); // returns a new String
        System.out.println("original = " + original + " | upper = " + upper);

        // ---------- INPUT USING SCANNER ----------
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\nEnter a single word (no spaces): ");
            String word = sc.next(); // reads token (stops at whitespace)
            System.out.println("You entered (word) : " + word);

            // consume the rest of the line before using nextLine()
            sc.nextLine();

            System.out.print("Enter a full line (can contain spaces): ");
            String line = sc.nextLine(); // reads full line
            System.out.println("You entered (line) : " + line);

            // ---------- BASIC PROPERTIES & CHAR ACCESS ----------
            System.out.println("\nLength of \"" + word + "\" is: " + word.length());
            if (!word.isEmpty()) {
                System.out.println("First character of \"" + word + "\" is: " + word.charAt(0));
            }

            // ---------- CONCATENATION ----------
            String firstName = "Niranjan";
            String lastName = "Singh";
            String fullName = firstName + " " + lastName; // simple concatenation
            System.out.println("\nConcatenation: " + fullName);

            // You can also use String.format (similar to printf)
            String formatted = String.format("Name: %s, Age: %d", fullName, 23);
            System.out.println("Formatted: " + formatted);

            // ---------- COMPARISON ----------
            // == compares references (object identity). For literals, JVM may reuse same object from pool.
            String s1 = "Niranjan";
            String s2 = "Niranjan";
            String s3 = new String("Niranjan");

            System.out.println("\nReference comparison (==):");
            System.out.println("s1 == s2 -> " + (s1 == s2)); // usually true (same interned literal)
            System.out.println("s1 == s3 -> " + (s1 == s3)); // false (s3 is a new object)

            // equals compares contents (what you usually want)
            System.out.println("\nContent comparison (equals):");
            System.out.println("s1.equals(s3) -> " + s1.equals(s3));

            // equalsIgnoreCase ignores case
            System.out.println("s1.equalsIgnoreCase(\"niranjan\") -> " + s1.equalsIgnoreCase("niranjan"));

            // compareTo for lexicographic ordering (negative if s1 < other, 0 if equal, positive if s1 > other)
            System.out.println("s1.compareTo(\"Niranjan\") -> " + s1.compareTo("Niranjan"));
            System.out.println("s1.compareTo(\"Aniranjan\") -> " + s1.compareTo("Aniranjan"));

            // ---------- COMMON STRING METHODS ----------
            String sample = "  Hello, Java World!  ";
            System.out.println("\nSample: \"" + sample + "\"");
            System.out.println("trim(): \"" + sample.trim() + "\"");          // removes leading/trailing whitespace
            System.out.println("toLowerCase(): \"" + sample.toLowerCase() + "\"");
            System.out.println("toUpperCase(): \"" + sample.toUpperCase() + "\"");
            System.out.println("indexOf(\"Java\"): " + sample.indexOf("Java")); // -1 if not found
            System.out.println("contains(\"World\"): " + sample.contains("World"));
            System.out.println("startsWith(\"  He\"): " + sample.startsWith("  He"));
            System.out.println("endsWith(\"!  \"): " + sample.endsWith("!  "));

            // substring(beginIndex, endIndex)
            System.out.println("substring(2, 7): \"" + sample.substring(2, 7) + "\"");

            // split (returns array)
            System.out.println("split on comma: " + Arrays.toString(sample.split(",")));

            // replace (returns new string)
            System.out.println("replace(\"Java\", \"C++\"): \"" + sample.replace("Java", "C++") + "\"");

            // ---------- STRING POOL & intern() ----------
            // intern() returns a string from the pool (adds it if not present)
            String s4 = new String("poolExample").intern();
            String s5 = "poolExample";
            System.out.println("\nUsing intern(): s4 == s5 -> " + (s4 == s5)); // true after intern

            // ---------- STRINGBUILDER (mutable alternative) ----------
            // If you need to modify text repeatedly (loops), use StringBuilder to avoid creating many temporary Strings.
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= 5; i++) {
                sb.append(i).append("-");
            }
            System.out.println("\nStringBuilder result: " + sb.toString());

            // Demonstrate in-place-like mutation
            sb.replace(0, sb.length(), "a,b,c");
            String[] parts = sb.toString().split(",");
            System.out.println("After replace & split using StringBuilder: " + Arrays.toString(parts));

            // ---------- COMMON BUGS & BEST PRACTICES ----------
            // 1. Use equals() to compare Strings for content equality.
            // 2. Avoid constructing Strings with 'new String(...)' unless you need a distinct object.
            // 3. For many concatenations in a loop, favor StringBuilder (or String.join for collections).
            // 4. Remember Strings are immutable; methods like toUpperCase/replace return new Strings.
            // 5. When reading user input with Scanner and mixing next() and nextLine(), consume the dangling newline.

            // Small interactive demonstration: count length and reversed string
            System.out.print("\nEnter a short word to reverse: ");
            String toReverse = sc.next();
            System.out.println("Length: " + toReverse.length());
            System.out.println("Reversed: " + reverseString(toReverse));
        } // Scanner auto-closed here
    }

    /**
     * Reverse a string using StringBuilder (efficient).
     *
     * @param s input string
     * @return reversed string
     */
    public static String reverseString(String s) {
        // StringBuilder has a built-in reverse() method
        return new StringBuilder(s).reverse().toString();
    }
}
