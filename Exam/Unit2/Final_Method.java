class Vehicle {
    final void start() {
        System.out.println("Vehicle is starting...");
    }
}
class Car extends Vehicle {
    //This method cannot override the final method from Vehicle
    @Override
    void start() {
        System.out.println("Car is starting...");
    }
    void drive() {
        System.out.println("Car is driving...");
    }
}
public class Final_Method {
    public static void main(String[] args) {
        Car car = new Car();
        car.start(); // Calls the final method from Vehicle class
        car.drive();
    }
}