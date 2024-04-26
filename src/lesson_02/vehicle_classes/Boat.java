package lesson_02.vehicle_classes;

import lesson_02.interfaces.Swimmable;

public class Boat extends Vehicle implements Swimmable {
    int maxSpeed;
    boolean isSailing;

    public Boat(int id, String brand, String model, int year, int maxSpeed, boolean isSailing){
        super(id, brand, model, year);
        this.maxSpeed = maxSpeed;
        this.isSailing = isSailing;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    public boolean getIsSailing(){
        return isSailing;
    }
    public void setIsSailing(boolean isSailing){
        this.isSailing = isSailing;
    }


    @Override
    public void displayInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Boat info is: {" +
                "id = " + super.getId() +
                ", brand = " + super.getBrand() +
                ", model = " + super.getModel() +
                ", year = " + super.getYear() +
                ", maxSpeed = " + maxSpeed +
                ", isSailing = " + isSailing +
                '}';
    }

    @Override
    public void  startEngine(){
        System.out.println("Boat starts engine");
    }

    @Override
    public void stopEngine(){
        System.out.println("Boat stops engine");
    }

    @Override
    public void startSwimming(){
        System.out.println("Boat starts swimming");
    }

    @Override
    public void stopSwimming(){
        System.out.println("Boat stops swimming");
    }
}
