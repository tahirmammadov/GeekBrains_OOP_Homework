package lesson_02.vehicle_classes;

public abstract class Vehicle {
    private int id;
    private String brand;
    private String model;
    private int year;

    public Vehicle(int id, String brand, String model, int year){
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }

    void startEngine(){};
    void stopEngine(){};
    void accelerate(int speed){};
    void brake(){};
    abstract void displayInfo();
}
