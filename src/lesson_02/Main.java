// Lesson 2. Principles of OOP Abstraction and interfaces. Design example

package lesson_02;

import lesson_02.vehicle_classes.*;

public class Main {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft(1, "Boeing", "747", 2021, 13700, true);
        Boat boat = new Boat(1, "Sea Ray", "L650", 2014, 30,true);
        Car car = new Car(1, "Mercedes-Benz", "S-Class", 2024, 70, 60);

        System.out.println("------------");
        aircraft.displayInfo();
        aircraft.startEngine();
        aircraft.stopEngine();
        aircraft.takeOff();
        aircraft.land();

        System.out.println("------------");
        boat.displayInfo();
        boat.startEngine();
        boat.stopEngine();
        boat.startSwimming();
        boat.stopSwimming();

        System.out.println("------------");
        car.displayInfo();
        car.startEngine();
        car.stopEngine();
        car.accelerate(140);
        car.brake();
        car.refuel(10);

    }
}
