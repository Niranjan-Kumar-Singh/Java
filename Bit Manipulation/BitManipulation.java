/**
 * BitManipulation.java
 *
 * Quick reminder:
 *   - Bits are the lowest-level representation of integers.
 *   - Manipulating bits is extremely fast and efficient.
 *   - Used in:
 *       * low-level programming
 *       * performance-critical code
 *       * compact storage (flags)
 *       * competitive programming
 */
public class BitManipulation {

    public static void main(String[] args) {

        /*
         -------------------------------------------------
         BITWISE OPERATORS (on integers)
         -------------------------------------------------
         &   : AND  -> bit is 1 only if both bits are 1
         |   : OR   -> bit is 1 if any one bit is 1
         ^   : XOR  -> bit is 1 if bits are DIFFERENT
         ~   : NOT  -> flips every bit (two's complement)
         <<  : LEFT SHIFT (a << b) shifts bits left by b positions, fills with zeros on right
               Mathematical relation (if no overflow): a << b == a * (2^b)
         >>  : RIGHT SHIFT (divide by 2)
         >>> : LOGICAL RIGHT SHIFT (fills left with 0)
         -------------------------------------------------
         */

        System.out.println("5 & 6 = " + (5 & 6));   // AND
        System.out.println("5 | 6 = " + (5 | 6));   // OR
        System.out.println("5 ^ 6 = " + (5 ^ 6));   // XOR
        System.out.println("~5   = " + (~5));       // NOT
        System.out.println("5 << 2 = " + (5 << 2)); // left shift => formula: a << b = a * 2^b
        System.out.println("6 >> 1 = " + (6 >> 1)); // right shift => formula: a >> b = a / 2^b (for positive numbers)

        /*
         -------------------------------------------------
         NOTES ABOUT >>> (LOGICAL RIGHT SHIFT)
         -------------------------------------------------
         >>  : keeps the sign bit (arithmetic right shift)
               - used for signed numbers
               - negative numbers keep the leading 1’s

         >>> : fills left side with 0 (logical right shift)
               - does NOT preserve sign
               - useful for unsigned operations
         -------------------------------------------------

         Example:
            int x = -5;

            x >> 1   (keeps sign bit, remains negative)
            x >>> 1  (fills with 0, becomes a large positive number)

         Because Java does NOT have unsigned int (except special conversions),
         >>> is used when you need unsigned behavior.
         -------------------------------------------------
         */

        int x = -5;
        System.out.println("-5 >> 1  = " + (x >> 1));
        System.out.println("-5 >>> 1 = " + (x >>> 1));

        /*
         -------------------------------------------------
         BINARY REPRESENTATION IN JAVA
         -------------------------------------------------
         - int is stored in 32 bits
         - Java uses *signed two's complement*
         - Negative numbers:
               ~x == -(x + 1)
           Example:
               ~5 = -6
         -------------------------------------------------
         */

        /*
         -------------------------------------------------
         WHY ~x BECOMES -(x+1) ?
         -------------------------------------------------
         Example:
                5  = 000...0101
               ~5  = 111...1010  (this is -6 in two's complement)

         Two's complement rule:
            - Invert bits → add 1 → get negative number

         Therefore:
            ~x = -(x + 1)
         -------------------------------------------------
         */

        /*
         -------------------------------------------------
         USE-CASES OF BIT MANIPULATION
         -------------------------------------------------
         ✔ Fast arithmetic (×2, ÷2 using shifts)
         ✔ Storing multiple flags in a single integer
         ✔ Checking odd/even quickly (x & 1)
         ✔ Competitive programming
         ✔ Cryptography, compression
         ✔ Low-level hardware-related tasks
         -------------------------------------------------
         */

        /*
         -------------------------------------------------
         COMMON BIT TRICKS  (Just explanations, no advanced code)
         -------------------------------------------------
         ✔ Check Odd/Even:
               x & 1
               1 → odd
               0 → even

         ✔ Multiply by 2:
               x << 1

         ✔ Divide by 2:
               x >> 1

         ✔ Turn ON a bit:
               x | (1 << i)

         ✔ Turn OFF a bit:
               x & ~(1 << i)

         ✔ Toggle a bit:
               x ^ (1 << i)

         ✔ Check if bit is set:
               (x & (1 << i)) != 0

         ✔ Remove lowest set bit:
               x & (x - 1)

         ✔ Get lowest set bit:
               x & -x
         -------------------------------------------------
         */

        /*
         -------------------------------------------------
         PRECEDENCE
         -------------------------------------------------
         - Shift operators (<<, >>, >>>) have lower precedence than + - but higher than relational operators.
         - Bitwise AND (&), XOR (^), OR (|) have lower precedence than shifts.
         - When mixing arithmetic and bitwise ops, use parentheses to be explicit.
         -------------------------------------------------
         */

        /*
         -------------------------------------------------
         PERFORMANCE NOTES
         -------------------------------------------------
         ✔ Bit operations are extremely fast (low-level CPU ops)
         ✔ Great for performance-critical code
         ✔ But avoid making code hard to read
         ✔ Only use bit tricks when necessary
         -------------------------------------------------
         */

        /*
         -------------------------------------------------
         SUMMARY
         -------------------------------------------------
         - Bit manipulation is fast, lightweight, and powerful
         - Useful for competitive programming and optimization
         - Start with basic operators (&, |, ^, ~, <<, >>, >>>)
         - Then move to bit tricks (set, clear, toggle bits)
         - Practice will make you master this topic
         -------------------------------------------------
         */
    }
}