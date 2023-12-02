
package main;
import java.time.Year;

public class Employee {
    // Constants for default values and constraints
    private static final double DEFAULT_MONTHLY_SALARY = 0;
    private static final double DEFAULT_OCCUPATION_RATE = 100;
    private static final double MINIMUM_OCCUPATION_RATE = 10;

    // Employee properties
    private String name;
    private int age;
    private int birthYear;
    private double monthlySalary;
    private double rate;
    private Vehicle employeeVehicle;
    private Contract employeeContract;

    // Constructor for creating an Employee without specifying rate and vehicle
    public Employee(String name, int birthYear) {
        this.name = name;
        this.age = Year.now().getValue() - birthYear;
        this.birthYear = birthYear;
        this.monthlySalary = DEFAULT_MONTHLY_SALARY;
        this.rate = DEFAULT_OCCUPATION_RATE;
    }

    // Constructor for creating an Employee with specified rate
    public Employee(String name, int birthYear, double rate) {
        this.name = name;
        this.age = Year.now().getValue() - birthYear;
        this.birthYear = birthYear;
        this.monthlySalary = DEFAULT_MONTHLY_SALARY;
        this.rate = this.getEffectiveOccupationRate(rate);
    }

    // Constructor for creating an Employee with specified vehicle
    public Employee(String name, int birthYear, Vehicle employeeVehicle) {
        this.name = name;
        this.age = Year.now().getValue() - birthYear;
        this.birthYear = birthYear;
        this.monthlySalary = DEFAULT_MONTHLY_SALARY;
        this.rate = this.getEffectiveOccupationRate(DEFAULT_OCCUPATION_RATE);
        this.employeeVehicle = employeeVehicle;
    }

    // Constructor for creating an Employee with specified rate and vehicle
    public Employee(String name, int birthYear, double rate, Vehicle employeeVehicle) {
        this.name = name;
        this.age = Year.now().getValue() - birthYear;
        this.birthYear = birthYear;
        this.monthlySalary = DEFAULT_MONTHLY_SALARY;
        this.rate = this.getEffectiveOccupationRate(rate);
        this.employeeVehicle = employeeVehicle;
    }

    // Setter for employee contract and monthly salary
    public void setEmployeeContract(Contract employeeContract) {
        this.employeeContract = employeeContract;
        this.monthlySalary = employeeContract.estimatedMonthlySalary();
    }

    // Method to get the effective occupation rate, considering constraints
    public double getEffectiveOccupationRate(double rate) {
        if (rate > DEFAULT_OCCUPATION_RATE) {
            return DEFAULT_OCCUPATION_RATE;
        } else if (rate < MINIMUM_OCCUPATION_RATE) {
            return MINIMUM_OCCUPATION_RATE;
        } else {
            return rate;
        }
    }

    // Method to get the occupation rate message
    public String getOccupationRateMessage() {
        return this.name + " has an Occupation rate: " + this.rate + "%";
    }

    // Method to format the occupation rate
    public double formatOccupationRate() {
        return this.rate / 100;
    }

    // Method to calculate monthly income based on the contract
    public double monthlyIncome() {
        return this.employeeContract != null ? this.employeeContract.estimatedMonthlySalary() : this.monthlySalary;
    }

    // Method to calculate annual income
    public double annualIncome() {
        return 12 * monthlyIncome() * this.formatOccupationRate();
    }

    // Method to print a message about a new employee
    public void printNewEmployeeMessage() {
        String newEmployeeMessage = "We have a new employee: " + this.name + ", a " + this.getClass().getSimpleName().toLowerCase() + ".";
        System.out.println(newEmployeeMessage);
    }

    // Method to get the estimated annual income message
    public String getEstimatedAnnualIncomeMessage() {
        return "His/Her estimated annual income is " + this.annualIncome();
    }

    // Method to sign a contract for an employee
    public void signContract(Contract employeeContract) {
        this.setEmployeeContract(employeeContract);
    }

    // Method to get contract information
    public String contractInfo() {
        return this.name + " is a " + this.getClass().getSimpleName().toLowerCase() +
                this.employeeContract + "\n";
    }

    // Override toString method to represent Employee details
    @Override
    public String toString() {
        return "Name: " + this.name + ", a " + this.getClass().getSimpleName() + "\n" +
                "Age: " + this.age + "\n" +
                this.employeeVehicle +
                this.getOccupationRateMessage() + "\n" +
                this.getEstimatedAnnualIncomeMessage();
    }
}
