/**
 * ElectricCar.java
 * A class implementing the Car interface.
 */
public class ElectricCar implements Car {

    @Override
    public void start() {
        System.out.println("ElectricCar starts silently");
    }

    @Override
    public void stop() {
        System.out.println("ElectricCar stops using regenerative braking");
    }
}