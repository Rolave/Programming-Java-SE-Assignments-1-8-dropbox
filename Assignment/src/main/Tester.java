package main;

public class Tester extends Employee {
    private int nbBugs;

    public Tester(String name, int birthYear, int nbBugs, int rate) {
        super(name, birthYear, rate);
        this.nbBugs = nbBugs;
        System.out.println(super.newEmployeeMessage());
    }
}
