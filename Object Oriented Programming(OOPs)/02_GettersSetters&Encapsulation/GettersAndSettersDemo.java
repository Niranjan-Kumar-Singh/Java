/**
 * GettersAndSettersDemo.java
 *
 * Demonstrates:
 * - Why we use getters and setters
 * - How they control access to private variables
 *
 * Getters → read values
 * Setters → update values with validation if needed
 */
public class GettersAndSettersDemo {

    public static void main(String[] args) {

        // Creating object
        Pencil p1 = new Pencil();

        // Setting values using SETTERS
        p1.setColor("Blue");
        p1.setTip(5);

        // Getting values using GETTERS
        System.out.println("Pencil Color: " + p1.getColor());
        System.out.println("Pencil Tip: " + p1.getTip());
    }
}