package main;

public class Motorcycle extends Vehicle {
    private boolean sidecar;

    public Motorcycle(String make, String plate, String color, VehicleType category, boolean sidecar) {
        super(make, plate, color, category);
        this.sidecar = sidecar;
    }

    public boolean isSidecar() {
        return sidecar;
    }

    public void setSidecar(boolean sidecar) {
        this.sidecar = sidecar;
    }

    @Override
    public String categoryVehicle() {
        return super.getCategory() == VehicleType.RACE
                ? "\t- category: " + super.getCategory().toString() + " " + this.getClass().getSimpleName() + "\n"
                : "\t- category: " + super.getCategory().toString() + "\n";
    }

    @Override
    public String toString() {
        String hasSidecar = sidecar ? "\t- with sidecar\n" : "\t- without sidecar\n";
        return super.toString() + hasSidecar;
    }
}
