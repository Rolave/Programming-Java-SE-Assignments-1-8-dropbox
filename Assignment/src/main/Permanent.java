package main;

public class Permanent implements Contract {
    int nbChildren;
    boolean married;
    int monthlySalary;
    int bonusPerChildPerMonth;
    int accumulatedDays;

    public Permanent(int nbChildren, boolean married, int monthlySalary, int bonusPerChildPerMonth, int accumulatedDays) {
        this.nbChildren = nbChildren;
        this.married = married;
        this.monthlySalary = monthlySalary;
        this.bonusPerChildPerMonth = bonusPerChildPerMonth;
        this.accumulatedDays = accumulatedDays;
    }

    @Override
    public double estimatedMonthlySalary() {
        return this.monthlySalary + contractBonuses();
    }

    @Override
    public double accumulatedSalary() {
        return this.accumulatedDays * estimatedMonthlySalary() / WORKING_DAYS;
    }

    @Override
    public double contractBonuses() {
        return this.married ? bonusPerChildPerMonth * this.nbChildren : 0;
    }

    @Override
    public String toString() {
        String isMarried = this.married ? "married" : "not married";
        return " he/she is " + isMarried + " and he/she has " + this.nbChildren + " children.\n" +
                "He/She has worked for " + accumulatedDays +
                " days and upon contract his/her monthly salary is " + this.monthlySalary + ".";
    }
}
