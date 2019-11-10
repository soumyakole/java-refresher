package com.soumya.corejava.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmpMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee("emp1", 1000);
        System.out.println(emp1);

        Employee emp2 = new Manager("Soumya",10988787.89);
        System.out.println(emp2);
        ((Manager) emp2).setBonus(100000);
        System.out.println(emp2.getSalary());

        Employee emp3 = new Employee("emp2",100000);
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


        System.out.println("************* sorting ***************");
        Collections.sort(staff);
        for (Employee e: staff){
            System.out.println(e);
        }

        // Sorting using anonymous on emp_id
        //Arrays.sort(staffs, (first,second) -> first.getId() - second.getId());
        Collections.sort(staff, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return ((Integer)o1.getId()).compareTo((Integer)o2.getId())  ;
            }
        });
        System.out.println("************* sorting on emp_id ***************");
        for (Employee e: staff){
            System.out.println(e);
        }

        // Sorting using lambda on emp_name
        Collections.sort(staff, (o1, o2) -> {return o1.getName().compareTo(o2.getName());});
        System.out.println("************* sorting on emp_name ***************");
        for (Employee e: staff){
            System.out.println(e);
        }

    }
}
