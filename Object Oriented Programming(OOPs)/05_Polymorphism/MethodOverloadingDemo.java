/**
 * MethodOverloadingDemo.java
 *
 * Runs examples using Calculator class.
 */
public class MethodOverloadingDemo {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("sum(2, 3) = " + calc.sum(2, 3));
        System.out.println("sum(2.5f, 3.5f) = " + calc.sum(2.5f, 3.5f));
        System.out.println("sum(1, 2, 3) = " + calc.sum(1, 2, 3));
        System.out.println("sum(1.1f, 2.2f, 3.3f) = " + calc.sum(1.1f, 2.2f, 3.3f));
    }
}