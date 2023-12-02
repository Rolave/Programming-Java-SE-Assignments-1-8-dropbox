package main;

// Car class represents a specific type of vehicle
public class Car extends Vehicle {
    private Gear gear;
    private CarType type;

    // Constructor for Car
    public Car(String make, String plate, String color, VehicleType category, Gear gear, CarType type) {
        super(make, plate, color, category);
        this.gear = gear;
        this.type = type;
    }

    // Getters and setters for Car class
    public Gear getGear() {
        return gear;
    }

    public void setGear(Gear gear) {
        this.gear = gear;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    // Override toString method to represent Car details
    @Override
    public String toString() {
        return super.toString() +
                "\t- gear type: " + this.gear.toString() + "\n" +
                "\t- type: " + this.type.toString() + "\n";
    }
}
