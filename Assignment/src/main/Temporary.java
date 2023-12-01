package main;

public class Temporary implements Contract {
    private double hourlySalary;
    private int accumulatedHours;

    public Temporary(double hourlySalary, int accumulatedHours) {
        this.hourlySalary = hourlySalary;
        this.accumulatedHours = accumulatedHours;
    }

    @Override
    public double estimatedMonthlySalary() {
        return this.accumulatedSalary() + contractBonuses();
    }

    @Override
    public double accumulatedSalary() {
        return this.accumulatedHours * this.hourlySalary;
    }

    @Override
    public double contractBonuses() {
        return 0;
    }

    @Override
    public String toString() {
        return " he/she is a temporary employee with " + this.hourlySalary +
                " hourly salary and he has worked for " + this.accumulatedHours + " hours.";
    }
}
