package lesson_02.vehicle_classes;

public class Car extends Vehicle {
    int fuelCapacity;
    int currentFuelLevel;

    public Car(int id, String brand, String model, int year, int fuelCapacity, int currentFuelLevel){
        super(id, brand, model, year);
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
    }

    public int getFuelCapacity(){
        return fuelCapacity;
    }
    public void setFuelCapacity(int fuelCapacity){
        this.fuelCapacity = fuelCapacity;
    }
    public int getCurrentFuelLevel(){
        return currentFuelLevel;
    }
    public void setCurrentFuelLevel(int currentFuelLevel){
        this.currentFuelLevel = currentFuelLevel;
    }

    @Override
    public void displayInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Car info is: {" +
                "id = " + super.getId() +
                ", brand = " + super.getBrand() +
                ", model = " + super.getModel() +
                ", year = " + super.getYear() +
                ", fuelCapacity = " + fuelCapacity +
                ", currentFuelLevel = " + currentFuelLevel +
                '}';
    }

    @Override
    public void  startEngine(){
        System.out.println("Car starts engine");
    }

    @Override
    public void stopEngine(){
        System.out.println("Car stops engine");
    }

    @Override
    public void accelerate(int speed){
        System.out.println("Car accelerates by " + speed + " km/h");
    }

    @Override
    public void brake(){
        System.out.println("Car brakes");
    }

    public void refuel(int litres){ System.out.println("Car is going to refuel " + litres + " litres"); }
}
