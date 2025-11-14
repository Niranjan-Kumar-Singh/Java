/**
 * StringBuilder_Basics.java
 *
 * This file explains everything about StringBuilder:
 *   ✔ What it is
 *   ✔ Why it is needed
 *   ✔ Time complexity vs String
 *   ✔ Difference vs StringBuffer
 *   ✔ Common methods with examples
 *   ✔ Performance notes
 *
 * ------------------------------------------------------------------------------------
 * WHAT IS STRINGBUILDER?
 * ------------------------------------------------------------------------------------
 * StringBuilder is a mutable (modifiable) sequence of characters in Java.
 * Unlike String (immutable), StringBuilder allows characters to be changed
 * without creating new objects, making it ideal for repeated concatenation.
 *
 * Class: java.lang.StringBuilder
 *
 *
 * ------------------------------------------------------------------------------------
 * WHY NOT USE STRING?
 * ------------------------------------------------------------------------------------
 * String is IMMUTABLE. Any modification creates a NEW String object.
 *
 * Example:
 *      String s = "";
 *      s = s + "a";
 *
 * Every time you use '+', Java creates:
 *      - a new String object
 *      - copies previous characters
 *
 * This leads to:
 *      ❌ Many temporary String objects
 *      ❌ High memory waste
 *      ❌ Slow performance inside loops
 *
 *
 * ------------------------------------------------------------------------------------
 * TIME COMPLEXITY
 * ------------------------------------------------------------------------------------
 * String concatenation in loop:      O(n²)
 * StringBuilder append in loop:      O(n)
 *
 * Why O(n²)?
 * - Every append copies the entire string again
 *   → 1 + 2 + 3 + ... + n = n(n+1)/2 operations = O(n²)
 *
 * Why O(n)?
 * - StringBuilder grows internally (resizes occasionally)
 * - Each append is amortized O(1)
 *
 *
 * ------------------------------------------------------------------------------------
 * STRINGBUILDER VS STRINGBUFFER
 * ------------------------------------------------------------------------------------
 * StringBuilder:
 *    ✔ Not synchronized (NOT thread-safe)
 *    ✔ Faster
 *    ✔ Preferred in single-threaded programs
 *
 * StringBuffer:
 *    ✔ Synchronized (thread-safe)
 *    ❌ Slower due to locking
 *    ✔ Use only when multiple threads modify the same buffer
 *
 *
 * ------------------------------------------------------------------------------------
 * COMMON STRINGBUILDER METHODS (with examples)
 * ------------------------------------------------------------------------------------
 *
 * 1. append(value)
 *      sb.append("Hello");
 *
 * 2. insert(index, value)
 *      sb.insert(2, "JAVA");  // inserts at index
 *
 * 3. delete(start, end)       (end is exclusive)
 *      sb.delete(1, 4);
 *
 * 4. deleteCharAt(index)
 *      sb.deleteCharAt(3);
 *
 * 5. replace(start, end, string)
 *      sb.replace(1, 4, "HELLO");
 *
 * 6. reverse()
 *      sb.reverse();
 *
 * 7. setCharAt(index, char)
 *      sb.setCharAt(0, 'X');
 *
 * 8. capacity()
 *      sb.capacity();
 *
 * 9. ensureCapacity(n)
 *      sb.ensureCapacity(100);   // ensures at least 100 chars capacity
 *
 * 10. length()
 *      sb.length();
 *
 *
 * ------------------------------------------------------------------------------------
 * WHEN TO USE STRINGBUILDER?
 * ------------------------------------------------------------------------------------
 * ✔ Repeated concatenation inside loops
 * ✔ Building dynamic strings (JSON, SQL, HTML)
 * ✔ Manipulating characters frequently
 * ✔ Creating large text content
 *
 * ------------------------------------------------------------------------------------
 * WHEN TO USE STRING?
 * ------------------------------------------------------------------------------------
 * ✔ When the string is small
 * ✔ When the value does NOT change
 * ✔ For constants, labels, configuration keys, etc.
 *
 */

public class StringBuilder_Basics {

    public static void main(String[] args) {

        // Example: Efficient alphabet creation (O(n))
        StringBuilder sb = new StringBuilder(26);
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println("Alphabet   : " + sb.toString());

        // Inefficient version (O(n²))
        String str = "";
        for (char ch = 'a'; ch <= 'z'; ch++) {
            str = str + ch;
        }
        System.out.println("String concat : " + str);


        // ----------------------------------------
        // STRINGBUILDER METHODS EXAMPLES
        // ----------------------------------------

        System.out.println("\n--- StringBuilder Methods Demo ---");

        StringBuilder demo = new StringBuilder("HelloWorld");

        // 1. append()
        demo.append("123");
        System.out.println("append()      : " + demo);

        // 2. insert()
        demo.insert(5, "_JAVA_");
        System.out.println("insert()      : " + demo);

        // 3. delete()
        demo.delete(5, 11); // removes "_JAVA_"
        System.out.println("delete()      : " + demo);

        // 4. deleteCharAt()
        demo.deleteCharAt(0); // remove 'H'
        System.out.println("deleteCharAt(): " + demo);

        // 5. replace()
        demo.replace(0, 4, "Test");
        System.out.println("replace()     : " + demo);

        // 6. reverse()
        demo.reverse();
        System.out.println("reverse()     : " + demo);

        // 7. setCharAt()
        demo.setCharAt(0, 'X');
        System.out.println("setCharAt()   : " + demo);

        // 8. capacity()
        System.out.println("capacity()    : " + demo.capacity());

        // 9. ensureCapacity()
        demo.ensureCapacity(100);
        System.out.println("New capacity(): " + demo.capacity());

        // 10. length()
        System.out.println("length()      : " + demo.length());
    }
}