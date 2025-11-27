import models.FinalParent;
import models.FinalChild;

/**
 * FinalMethodDemo.java
 *
 * Demonstrates final methods:
 *  - final on method prevents overriding in subclasses.
 *
 * Compile & run:
 *   javac FinalMethodDemo.java
 *   java FinalMethodDemo
 */

public class FinalMethodDemo {

    public static void main(String[] args) {
        FinalParent  p = new FinalParent ();
        p.sayHello();

        FinalChild  c = new FinalChild ();
        c.sayHello();      // calls final method from Parent
        c.extraMethod();   // child-specific
    }
}