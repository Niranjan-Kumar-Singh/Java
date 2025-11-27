/**
 * FinalReferenceDemo.java
 *
 * Focused demo showing final references vs reassignments and shallow mutation.
 *
 * Compile & run:
 *   javac FinalReferenceDemo.java
 *   java FinalReferenceDemo
 */
public class FinalReferenceDemo {

    public static void main(String[] args) {
        final int[] arr = {1, 2, 3};

        System.out.println("Before mutation: " + java.util.Arrays.toString(arr));
        // Allowed: mutate contents
        arr[0] = 99;
        System.out.println("After mutation: " + java.util.Arrays.toString(arr));

        // Not allowed: reassign arr to new array (uncomment to see compile error)
        // arr = new int[]{4,5,6}; // ❌ compile error

        final StringBuilder sb = new StringBuilder("hello");
        sb.append(" world"); // allowed
        System.out.println("StringBuilder after append: " + sb.toString());
        // sb = new StringBuilder("new"); // ❌ compile error if uncommented
    }
}