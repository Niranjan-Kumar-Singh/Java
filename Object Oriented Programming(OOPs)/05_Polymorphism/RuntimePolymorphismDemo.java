/**
 * RuntimePolymorphismDemo.java
 *
 * Demonstrates dynamic method dispatch and instanceof usage.
 */
public class RuntimePolymorphismDemo {

    public static void main(String[] args) {

        Animal a1 = new Animal();
        Animal a2 = new Deer();
        Animal a3 = new Dog();

        Animal[] arr = {a1, a2, a3};

        for (Animal a : arr) {
            a.eat();

            if (a instanceof Dog) {
                Dog d = (Dog) a;
                d.fetch();
            }

            System.out.println("---");
        }
    }
}