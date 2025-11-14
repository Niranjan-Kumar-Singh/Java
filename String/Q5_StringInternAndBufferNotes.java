/**
 * StringInternAndBufferNotes.java
 *
 * Combined notes + runnable examples for:
 *   1) String.intern()  -> what it does, why/when to use it
 *   2) StringBuffer     -> thread-safe mutable string, common methods
 *
 * This file is both documentation (comments) and executable examples.
 *
 * Compile & run:
 *   javac StringInternAndBufferNotes.java
 *   java StringInternAndBufferNotes
 *
 * ------------------------------------------------------------------------
 * NOTES SUMMARY (quick)
 *
 *  - String.intern()
 *      * Moves / registers a String in the String Constant Pool (SCP) and
 *        returns the pooled reference.
 *      * Useful to save memory when many identical strings are created.
 *      * "==" compares references; intern() enables reference-equality for
 *        equal strings stored in the pool.
 *
 *  - StringBuffer
 *      * Mutable sequence of characters (like StringBuilder) but synchronized.
 *      * Thread-safe: methods are synchronized; useful when multiple threads
 *        concurrently modify the same buffer.
 *      * Slightly slower than StringBuilder due to synchronization overhead.
 *
 * ------------------------------------------------------------------------
 */

public class Q5_StringInternAndBufferNotes {

    public static void main(String[] args) {
        System.out.println("=== String.intern() Demonstration ===");
        demoStringIntern();

        System.out.println("\n=== StringBuffer Methods Demonstration ===");
        demoStringBufferMethods();

        System.out.println("\n=== When to use what (short) ===");
        System.out.println(" - Use String (immutable) for constants and values that don't change.");
        System.out.println(" - Use StringBuilder for fast, single-threaded mutable operations.");
        System.out.println(" - Use StringBuffer when multiple threads must safely modify the same buffer.");
    }

    /**
     * Demonstrates String.intern() behaviour with simple examples and prints results.
     *
     * Key points shown:
     *  - Literals are placed in the String Constant Pool (SCP) by the compiler.
     *  - new String(...) creates a separate heap object.
     *  - s.intern() returns the pooled reference (if an equal literal exists in pool,
     *    it returns that reference; otherwise it adds the string to the pool and
     *    returns the pooled reference).
     */
    private static void demoStringIntern() {
        // A literal - stored in the String Constant Pool (SCP)
        String lit1 = "hello";

        // Another literal with same content -> references the same pooled object
        String lit2 = "hello";

        System.out.println("lit1 == lit2 (both literals): " + (lit1 == lit2)); // true

        // new String(...) creates a new object on the heap (not the pool)
        String heapStr = new String("hello");
        System.out.println("heapStr == lit1 (new String vs literal): " + (heapStr == lit1)); // likely false

        // intern() returns the pooled reference for the string content
        String interned = heapStr.intern();
        System.out.println("interned == lit1 (after intern): " + (interned == lit1)); // true

        // Example when the string did not exist previously in the pool
        String dynamic = new StringBuilder().append("ja").append("va").toString(); // "java" built at runtime
        // If "java" literal already exists in the pool, intern will return that pooled ref.
        String dynamicInterned = dynamic.intern();
        String literalJava = "java";
        System.out.println("dynamic == literalJava (before intern): " + (dynamic == literalJava)); // usually false
        System.out.println("dynamicInterned == literalJava (after intern): " + (dynamicInterned == literalJava)); // true

        // Practical note printed for clarity
        System.out.println("\nPractical notes:");
        System.out.println(" - Use intern() when you have many duplicate strings and want to save memory");
        System.out.println(" - Avoid excessive interning of large unique strings (can increase pool usage)");
    }

    /**
     * Demonstrates commonly used StringBuffer methods with examples.
     * Each operation prints the result so the effect is clear.
     *
     * Methods shown:
     *   append, insert, delete, deleteCharAt, replace, reverse,
     *   setCharAt, capacity, ensureCapacity, length, toString
     */
    private static void demoStringBufferMethods() {
        // Create a StringBuffer with initial content
        StringBuffer sb = new StringBuffer("HelloWorld");
        System.out.println("Initial     : " + sb.toString());

        // append(value) - adds at the end
        sb.append("123");
        System.out.println("append(\"123\"): " + sb.toString());

        // insert(index, value) - insert value at given index
        sb.insert(5, "_JAVA_");
        System.out.println("insert(5, \"_JAVA_\"): " + sb.toString());

        // delete(start, end) - end is exclusive
        sb.delete(5, 11); // removes "_JAVA_"
        System.out.println("delete(5,11)  : " + sb.toString());

        // deleteCharAt(index)
        sb.deleteCharAt(0); // remove first char 'H'
        System.out.println("deleteCharAt(0): " + sb.toString());

        // replace(start, end, str)
        // Note: replace end is exclusive. Here we replace first 4 chars with "Test"
        sb.replace(0, Math.min(4, sb.length()), "Test");
        System.out.println("replace(0,4,\"Test\"): " + sb.toString());

        // reverse()
        sb.reverse();
        System.out.println("reverse()     : " + sb.toString());

        // setCharAt(index, char)
        if (sb.length() > 0) {
            sb.setCharAt(0, 'X');
            System.out.println("setCharAt(0,'X'): " + sb.toString());
        }

        // capacity() and ensureCapacity()
        System.out.println("length()      : " + sb.length());
        System.out.println("capacity()    : " + sb.capacity());
        // Ensure a larger capacity (no effect if capacity already >= value)
        sb.ensureCapacity(100);
        System.out.println("ensureCapacity(100) -> capacity(): " + sb.capacity());

        // Final toString()
        String finalString = sb.toString();
        System.out.println("Final toString(): " + finalString);

        // Thread-safety note:
        System.out.println("\nThread-safety note:");
        System.out.println(" - StringBuffer methods are synchronized, making it safe for concurrent use");
        System.out.println(" - For single-threaded performance, prefer StringBuilder (not shown here)");
    }
}