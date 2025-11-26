/**
 * DieselCar.java
 * Another class implementing the Car interface.
 */
public class DieselCar implements Car {

    @Override
    public void start() {
        System.out.println("DieselCar starts with diesel engine sound");
    }

    @Override
    public void stop() {
        System.out.println("DieselCar stops using hydraulic brakes");
    }
}