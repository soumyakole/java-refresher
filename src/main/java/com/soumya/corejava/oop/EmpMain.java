package com.soumya.corejava.oop;

public class EmpMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        System.out.println(emp1);

        Employee emp2 = new Manager("Soumya",10988787.89);
        System.out.println(emp2);
        ((Manager) emp2).setBonus(100000);
        System.out.println(emp2.getSalary());

        Employee emp3 = new Employee(100000);
        System.out.println(emp3);
    }
}
