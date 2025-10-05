// Program 4: Multilevel Inheritance

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    void accelerate() {
        System.out.println("Car is accelerating...");
    }
}

class ElectricCar extends Car {
    void chargeBattery() {
        System.out.println("Electric car is charging...");
    }
}

public class ElectricCarDemo {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();
        e.start();
        e.accelerate();
        e.chargeBattery();
    }
}

