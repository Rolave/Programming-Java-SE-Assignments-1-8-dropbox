package main;

public class Tester extends Employee {
    private static final int GAIN_FACTOR_ERROR = 10;
    private int nbBugs;

    public Tester(String name, int birthYear, int nbBugs, double rate) {
        super(name, birthYear, rate);
        this.nbBugs = nbBugs;
        super.printNewEmployeeMessage();
    }

    public Tester(String name, int birthYear, int nbBugs, double rate, Vehicle employeeVehicle) {
        super(name, birthYear, rate, employeeVehicle);
        this.nbBugs = nbBugs;
        super.printNewEmployeeMessage();
    }

    @Override
    public String getOccupationRateMessage() {
        return super.getOccupationRateMessage() + " and corrected " + nbBugs + " bugs.";
    }

    @Override
    public double annualIncome() {
        return super.annualIncome() + this.nbBugs * GAIN_FACTOR_ERROR;
    }
}
