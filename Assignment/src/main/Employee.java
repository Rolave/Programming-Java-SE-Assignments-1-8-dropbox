package main;

import java.time.Year;

public class Employee {
    private static final double DEFAULT_MONTHLY_SALARY = 0;
    private static final double DEFAULT_OCCUPATION_RATE = 100;
    private static final double MINIMUM_OCCUPATION_RATE = 10;
    private String name;
    private int age;
    private int birthYear;
    private double monthlySalary;
    private double rate;

    public Employee(String name, int birthYear) {
        this.name = name;
        this.age = Year.now().getValue() - birthYear;
        this.birthYear = birthYear;
        this.monthlySalary = DEFAULT_MONTHLY_SALARY;
        this.rate = DEFAULT_OCCUPATION_RATE;
    }

    public Employee(String name, int birthYear, int rate) {
        this.name = name;
        this.age = Year.now().getValue() - birthYear;
        this.birthYear = birthYear;
        this.monthlySalary = DEFAULT_MONTHLY_SALARY;
        this.rate = this.getEffectiveOccupationRate(rate);
    }

    public double getEffectiveOccupationRate(int rate) {
        if (rate > DEFAULT_OCCUPATION_RATE) {
            return DEFAULT_OCCUPATION_RATE;
        } else if (rate < MINIMUM_OCCUPATION_RATE) {
            return MINIMUM_OCCUPATION_RATE;
        } else {
            return rate;
        }
    }

    public String newEmployeeMessage() {
        return "We have a new employee: " + this.name + ", a " + this.getClass().getSimpleName().toLowerCase() + ".";
    }

    @Override
    public String toString() {
        return this.newEmployeeMessage();
    }
}
