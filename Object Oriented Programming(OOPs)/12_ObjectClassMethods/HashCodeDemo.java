import models.Product;
import java.util.HashSet;

public class HashCodeDemo {
    public static void main(String[] args) {

        Product p1 = new Product(10, "Mouse", 700);
        Product p2 = new Product(10, "Wireless Mouse", 900);

        HashSet<Product> set = new HashSet<>();
        set.add(p1);
        set.add(p2);  // duplicates prevented because equals+hashCode match

        System.out.println("HashSet size: " + set.size());
        System.out.println(set);
    }
}