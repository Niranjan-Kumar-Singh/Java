/**
 * InterfaceDemo.java
 *
 * Runs simple interface examples.
 */
public class InterfaceDemo {

    public static void main(String[] args) {

        Car eCar = new ElectricCar();
        eCar.start();
        eCar.stop();

        System.out.println("-------------------");

        Car dCar = new DieselCar();
        dCar.start();
        dCar.stop();

        System.out.println("-------------------");

        // Calling static method
        Car.wheels();
    }
}