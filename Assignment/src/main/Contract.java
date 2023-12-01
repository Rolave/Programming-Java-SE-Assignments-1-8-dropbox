package main;

public interface Contract {
    public static final double WORKING_DAYS = 20;
    public abstract double estimatedMonthlySalary();
    public abstract double accumulatedSalary();

    public abstract double contractBonuses();
}
