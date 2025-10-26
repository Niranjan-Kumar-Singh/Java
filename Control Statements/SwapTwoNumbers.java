public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Display original values
        System.out.println("Before swapping:");
        System.out.println("a = " + a + ", b = " + b);

        // --- Swapping using a temporary variable ---
        System.out.println("\nSwapping using a temporary variable:");
        int temp = a;  // Store value of a in temp
        a = b;         // Assign value of b to a
        b = temp;      // Assign original value of a (stored in temp) to b

        System.out.println("After swapping:");
        System.out.println("a = " + a + ", b = " + b);

        // --- Swapping again without using a temporary variable ---
        System.out.println("\nSwapping again without using a temporary variable:");
        a = a + b;  // Sum of both values stored in a
        b = a - b;  // Original value of a is restored into b
        a = a - b;  // Original value of b is restored into a

        System.out.println("After swapping again:");
        System.out.println("a = " + a + ", b = " + b);
    }
}
