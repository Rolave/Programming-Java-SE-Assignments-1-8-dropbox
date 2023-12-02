package main;

// Contract interface represents a contract for an employee
public interface Contract {
    // Constants for default values
    public static final double WORKING_DAYS = 20;

    // Method to calculate the estimated monthly salary
    public abstract double estimatedMonthlySalary();

    // Method to calculate the accumulated salary
    public abstract double accumulatedSalary();

    // Method to calculate contract bonuses (to be implemented by implementing classes)
    public abstract double contractBonuses();
}
