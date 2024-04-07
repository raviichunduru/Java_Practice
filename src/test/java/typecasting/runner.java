package typecasting;

import typecasting.Car;
import typecasting.Vehicle;

public class runner {
  public static void main(String[] args) {
    // Create an instance of Vehicle and call its start method
    Vehicle vehicle1 = new Vehicle();
    vehicle1.start();

    // Create an instance of Car but reference it with a Vehicle reference
    // This demonstrates polymorphism
    Vehicle vehicle2 = new Car();
    vehicle2.start();

    // Create an instance of Car and call its start and horn methods
    Car car1 = new Car();
    car1.start();
    car1.horn();

    // Typecast vehicle2 to Car
    // Since vehicle2 actually holds a Car object, this typecasting is valid
    Car car2 = (Car) vehicle2;
    car2.start();
    car2.horn();
  }
}
