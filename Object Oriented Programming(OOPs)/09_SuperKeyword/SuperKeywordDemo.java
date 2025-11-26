/**
 * SuperKeywordDemo.java
 *
 * Runs the tests to demonstrate the usage of super keyword.
 */
public class SuperKeywordDemo {

    public static void main(String[] args) {

        Child child = new Child();

        System.out.println("------------------------");
        child.printNames();

        System.out.println("------------------------");
        child.showMessages();
    }
}