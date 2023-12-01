package main;

import java.io.Console;

public class Programmer extends Employee {
    private int nbProjects;

    public Programmer(String name, int birthYear, int rate) {
        super(name, birthYear, rate);
        System.out.println(super.newEmployeeMessage());
    }

    public Programmer(String name, int birthYear, int nbProjects, int rate) {
        super(name, birthYear, rate);
        this.nbProjects = nbProjects;
        System.out.println(super.newEmployeeMessage());
    }
}
