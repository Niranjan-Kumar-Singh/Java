/**
 * Pen.java
 *
 * Simple class that represents a Pen.
 * Used to demonstrate:
 * - fields (state)
 * - constructors
 * - getters and setters (basic encapsulation)
 * - small helper method
 *
 * Keep this class small and focused so it is easy to reuse in demos.
 */
public class Pen {

    // Fields (package-private). In real code prefer private + getters/setters.
    String color;
    int tip;

    /**
     * Default constructor.
     * Initializes pen with common defaults.
     */
    public Pen() {
        this.color = "black";
        this.tip = 1;
    }

    /**
     * Parameterized constructor.
     *
     * @param color pen color (e.g., "Blue")
     * @param tip   tip size (e.g., 1, 2, 5)
     */
    public Pen(String color, int tip) {
        this.color = color;
        this.tip = tip;
    }

    // Setter methods (encapsulation pattern)
    public void setColor(String newColor) {
        this.color = newColor;
    }

    public void setTip(int newTip) {
        if (newTip <= 0) {
            System.out.println("Tip size should be positive. Keeping previous value: " + this.tip);
            return;
        }
        this.tip = newTip;
    }

    // Getter methods
    public String getColor() {
        return color;
    }

    public int getTip() {
        return tip;
    }

    /**
     * Small helper that prints pen details in a friendly format.
     */
    public void show() {
        System.out.println("Pen -> color: " + color + ", tip: " + tip);
    }

    /**
     * toString() method:
     *
     * When a Pen object is printed (for example: System.out.println(p1)),
     * Java automatically calls this toString() method to convert the object
     * into a readable String.
     *
     * Without overriding this method, Java prints something like:
     * Pen@3f99bd52 (memory address)
     *
     * By overriding it, we control how the object should be displayed.
     * Now printing the object will show:
     * Pen[color=Blue, tip=5]
     */
    @Override
    public String toString() {
        return "Pen[color=" + color + ", tip=" + tip + "]";
    }
}