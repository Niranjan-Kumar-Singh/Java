import models.Product;
import models.Customer;
import models.Employee;

public class ToStringDemo {
    public static void main(String[] args) {

        Product p = new Product(1, "Laptop", 65000.0);
        Customer c = new Customer("abc@gmail.com", "Niranjan");
        Employee e = new Employee(101, "Sales");

        System.out.println(p);   // calls toString()
        System.out.println(c);
        System.out.println(e);
    }
}