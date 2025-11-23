/**
 * Pencil.java
 *
 * Demonstrates the use of private variables with
 * public getters and setters — a key part of Encapsulation.
 *
 * This class is intentionally simple so it can be reused
 * in multiple demos.
 */
public class Pencil {

    private String color;
    private int tip;

    /**
     * Setter for color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Getter for color
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Setter for tip size (with basic validation)
     */
    public void setTip(int tip) {
        if (tip <= 0) {
            System.out.println("Tip size must be positive.");
            return;
        }
        this.tip = tip;
    }

    /**
     * Getter for tip size
     */
    public int getTip() {
        return this.tip;
    }
}