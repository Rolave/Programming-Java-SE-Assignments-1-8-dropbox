package main;

public class Manager extends Employee {
    int nbClients;
    int nbTravelDays;

    public Manager(String name, int birthYear, int nbClients, int nbTravelDays) {
        super(name, birthYear);
        this.nbClients = nbClients;
        this.nbTravelDays = nbTravelDays;
        System.out.println(super.newEmployeeMessage());
    }

    public Manager(String name, int birthYear, int nbClients, int nbTravelDays, int rate) {
        super(name, birthYear, rate);
        this.nbClients = nbClients;
        this.nbTravelDays = nbTravelDays;
        System.out.println(super.newEmployeeMessage());
    }
}