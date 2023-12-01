package main;

public class Manager extends Employee {
    private static final int GAIN_FACTOR_CLIENT = 500;
    private static final int GAIN_FACTOR_TRAVEL = 100;
    int nbClients;
    int nbTravelDays;

    public Manager(String name, int birthYear, int nbClients, int nbTravelDays) {
        super(name, birthYear);
        this.nbClients = nbClients;
        this.nbTravelDays = nbTravelDays;
        super.printNewEmployeeMessage();
    }

    public Manager(String name, int birthYear, int nbClients, int nbTravelDays, double rate) {
        super(name, birthYear, rate);
        this.nbClients = nbClients;
        this.nbTravelDays = nbTravelDays;
        super.printNewEmployeeMessage();
    }

    public Manager(String name, int birthYear, int nbClients, int nbTravelDays, Vehicle employeeVehicle) {
        super(name, birthYear, employeeVehicle);
        this.nbClients = nbClients;
        this.nbTravelDays = nbTravelDays;
        super.printNewEmployeeMessage();
    }

    public Manager(String name, int birthYear, int nbClients, int nbTravelDays, double rate, Vehicle employeeVehicle) {
        super(name, birthYear, rate, employeeVehicle);
        this.nbClients = nbClients;
        this.nbTravelDays = nbTravelDays;
        super.printNewEmployeeMessage();
    }

    @Override
    public String getOccupationRateMessage() {
        return super.getOccupationRateMessage() +
                " He/She travelled " + this.nbTravelDays +
                " days and has brought " + this.nbClients +" new clients.";
    }

    @Override
    public double annualIncome() {
        return super.annualIncome() + this.nbClients * GAIN_FACTOR_CLIENT + this.nbTravelDays * GAIN_FACTOR_TRAVEL;

    }
}