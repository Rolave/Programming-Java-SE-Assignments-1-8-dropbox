package main;

public class Programmer extends Employee {
    private static final int GAIN_FACTOR_PROJECTS = 200;
    private int nbProjects;

    public Programmer(String name, int birthYear, double rate) {
        super(name, birthYear, rate);
        super.printNewEmployeeMessage();
    }

    public Programmer(String name, int birthYear, int nbProjects, double rate) {
        super(name, birthYear, rate);
        this.nbProjects = nbProjects;
        super.printNewEmployeeMessage();
    }

    public Programmer(String name, int birthYear, int nbProjects, Vehicle employeeVehicle) {
        super(name, birthYear, employeeVehicle);
        this.nbProjects = nbProjects;
        super.printNewEmployeeMessage();
    }

    public Programmer(String name, int birthYear, int nbProjects, double rate, Vehicle employeeVehicle) {
        super(name, birthYear, rate, employeeVehicle);
        this.nbProjects = nbProjects;
        super.printNewEmployeeMessage();
    }

    @Override
    public String getOccupationRateMessage() {
        return super.getOccupationRateMessage() +
                " and completed " + this.nbProjects + " projects.";
    }

    @Override
    public double annualIncome() {
        return super.annualIncome() + this.nbProjects * GAIN_FACTOR_PROJECTS;
    }
}
