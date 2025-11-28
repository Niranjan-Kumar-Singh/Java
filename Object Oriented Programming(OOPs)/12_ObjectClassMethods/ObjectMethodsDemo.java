import models.Employee;

public class ObjectMethodsDemo {
    public static void main(String[] args) {

        Employee e = new Employee(201, "HR");

        System.out.println("toString(): " + e.toString());
        System.out.println("getClass(): " + e.getClass());
        System.out.println("hashCode(): " + e.hashCode());
    }
}