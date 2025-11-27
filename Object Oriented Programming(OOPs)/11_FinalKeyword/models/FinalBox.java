package models;

public final class FinalBox {

    private final String id;

    public FinalBox(String id) {
        this.id = id;
    }

    // The toString() method gives a meaningful string representation of the object.
    // When we print a FinalBox object (System.out.println(box)),
    // Java automatically calls this method to decide what to display.
    // Overriding it helps show useful information instead of the default memory address.
    @Override
    public String toString() {
        return "FinalBox[id=" + id + "]";
    }
}