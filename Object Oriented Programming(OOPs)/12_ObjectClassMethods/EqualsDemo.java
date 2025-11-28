import models.Product;
import models.Customer;

public class EqualsDemo {
    public static void main(String[] args) {

        Product p1 = new Product(1, "Laptop", 65000.0);
        Product p2 = new Product(1, "Laptop Pro", 95000.0);

        System.out.println("p1 == p2 ? " + (p1 == p2));
        System.out.println("p1.equals(p2) ? " + p1.equals(p2));

        Customer c1 = new Customer("test@gmail.com", "John");
        Customer c2 = new Customer("TEST@gmail.com", "John");

        System.out.println("c1.equals(c2) ? " + c1.equals(c2));
    }
}