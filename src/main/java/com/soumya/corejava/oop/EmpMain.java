package com.soumya.corejava.oop;

import java.util.ArrayList;

public class EmpMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        System.out.println(emp1);

        Employee emp2 = new Manager("Soumya",10988787.89);
        System.out.println(emp2);
        ((Manager) emp2).setBonus(100000);
        System.out.println(emp2.getSalary());

        Employee emp3 = new Employee("emp",100000);
        Employee emp4 = new Employee("emp",100000);
        System.out.println(emp3.equals(emp2));
        System.out.println(emp4.equals(emp3));


        //ArrayList
        ArrayList<Employee> staff = new ArrayList<>();
        staff.add(emp1);
        staff.add(emp2);
        staff.add(emp3);

        for (Employee e: staff){
            System.out.println(e);
        }
    }
}
