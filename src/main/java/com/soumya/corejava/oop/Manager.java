package com.soumya.corejava.oop;

public class Manager extends Employee {

    private double bonus;
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String n, double s) {
        super(n, s);
    }

    @Override
    public double getSalary(){
        return super.getSalary() + bonus;
    }
}
