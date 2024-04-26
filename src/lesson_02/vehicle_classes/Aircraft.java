package lesson_02.vehicle_classes;

import lesson_02.interfaces.Flyable;

public class Aircraft extends Vehicle implements Flyable {
    private int maxAltitude;
    private boolean isFlying;


    public Aircraft(int id, String brand, String model, int year, int maxAltitude, boolean isFlying){
        super(id, brand, model, year);
        this.maxAltitude = maxAltitude;
        this.isFlying = isFlying;

    }

    public int getMaxAltitude(){
        return maxAltitude;
    }
    public void setMaxAltitude(int maxAltitude){
        this.maxAltitude = maxAltitude;
    }
    public boolean getIsFlying(){
        return isFlying;
    }
    public void setIsFlying(boolean isFlying){
        this.isFlying = isFlying;
    }



    @Override
    public void displayInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Aircraft info is: {" +
                "id = " + super.getId() +
                ", brand = " + super.getBrand() +
                ", model = " + super.getModel() +
                ", year = " + super.getYear() +
                ", maxAltitude = " + maxAltitude +
                ", isFlying = " + isFlying +
                '}';
    }

    @Override
    public void  startEngine(){
        System.out.println("Aircraft starts engine");
    }

    @Override
    public void stopEngine(){
        System.out.println("Aircraft stops engine");
    }

    @Override
    public void takeOff(){
        System.out.println("Aircraft takes off");
    }

    @Override
    public void land(){
        System.out.println("Aircraft lands");
    }
}
