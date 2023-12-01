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
    private Vehicle employeeVehicle;
    private Contract employeeContract;

    public Employee(String name, int birthYear) {
        this.name = name;
        this.age = Year.now().getValue() - birthYear;
        this.birthYear = birthYear;
        this.monthlySalary = DEFAULT_MONTHLY_SALARY;
        this.rate = DEFAULT_OCCUPATION_RATE;
    }

    public Employee(String name, int birthYear, double rate) {
        this.name = name;
        this.age = Year.now().getValue() - birthYear;
        this.birthYear = birthYear;
        this.monthlySalary = DEFAULT_MONTHLY_SALARY;
        this.rate = this.getEffectiveOccupationRate(rate);
    }

    public Employee(String name, int birthYear, Vehicle employeeVehicle) {
        this.name = name;
        this.age = Year.now().getValue() - birthYear;
        this.birthYear = birthYear;
        this.monthlySalary = DEFAULT_MONTHLY_SALARY;
        this.rate = this.getEffectiveOccupationRate(DEFAULT_OCCUPATION_RATE);
        this.employeeVehicle = employeeVehicle;
    }

    public Employee(String name, int birthYear, double rate, Vehicle employeeVehicle) {
        this.name = name;
        this.age = Year.now().getValue() - birthYear;
        this.birthYear = birthYear;
        this.monthlySalary = DEFAULT_MONTHLY_SALARY;
        this.rate = this.getEffectiveOccupationRate(rate);
        this.employeeVehicle = employeeVehicle;
    }

    public void setEmployeeContract(Contract employeeContract) {
        this.employeeContract = employeeContract;
        this.monthlySalary = employeeContract.estimatedMonthlySalary();
    }

    public double getEffectiveOccupationRate(double rate) {
        if (rate > DEFAULT_OCCUPATION_RATE) {
            return DEFAULT_OCCUPATION_RATE;
        } else if (rate < MINIMUM_OCCUPATION_RATE) {
            return MINIMUM_OCCUPATION_RATE;
        } else {
            return rate;
        }
    }

    public String getOccupationRateMessage() {
        return this.name + " has an Occupation rate: " + this.rate + "%";
    }

    public double formatOccupationRate() {
        return this.rate / 100;
    }

    public double monthlyIncome() {
        return this.employeeContract != null ? this.employeeContract.estimatedMonthlySalary() : this.monthlySalary;
    }

    public double annualIncome() {
        return 12 * monthlyIncome() * this.formatOccupationRate();
    }

    public void printNewEmployeeMessage() {
        String newEmployeeMessage = "We have a new employee: " + this.name + ", a " + this.getClass().getSimpleName().toLowerCase() + ".";
        System.out.println(newEmployeeMessage);
    }

    public String getEstimatedAnnualIncomeMessage() {
        return "His/Her estimated annual income is " + this.annualIncome();
    }

    public void signContract(Contract employeeContract) {
        this.setEmployeeContract(employeeContract);
    }

    public String contractInfo() {
        return this.name + " is a " + this.getClass().getSimpleName().toLowerCase() +
                this.employeeContract + "\n";
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", a " + this.getClass().getSimpleName() + "\n" +
                "Age: " + this.age + "\n" +
                this.employeeVehicle +
                this.getOccupationRateMessage() + "\n" +
                this.getEstimatedAnnualIncomeMessage();
    }
}
