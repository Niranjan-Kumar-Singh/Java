package models;

// A real-world example of a class where equals() and hashCode() matter.
// Used in sets, maps, duplicate checking, etc.
public class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // toString() -> human readable output
    @Override
    public String toString() {
        return "Product[id=" + id + ", name=" + name + ", price=" + price + "]";
    }

    // equals() -> logical equality based on product ID
    @Override
    public boolean equals(Object obj) {

        // 1. Check same object reference
        if (this == obj) return true;

        // 2. If other object is null or not Product -> false
        if (obj == null || this.getClass() != obj.getClass()) return false;

        // 3. Type cast
        Product other = (Product) obj;

        // 4. Compare using logical property (id)
        return this.id == other.id;
    }

    // hashCode() must match equals()
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}