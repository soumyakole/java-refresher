package com.soumya.corejava.oop;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;

public class Employee implements Comparable<Employee> {

    private static int nextId;

    private int id;
    private String name = ""; // instance field initialization
    private double salary;
    private LocalDate hireDay;

    static
    {
        Random generator = new Random();
        // set nextId to a random number between 0 and 9999
        nextId = generator.nextInt(10000);
        System.out.println("nextID generated !!!");

    }

    {
        //object initialization block,
        // no matter which constructor is used to construct an object.
        // The initialization block runs first, and then the body of the constructor is executed.
        id = nextId;
        nextId++;
    }


    public Employee(String n, double s)
    {
        name = n;
        salary = s;
        hireDay = LocalDate.now();
    }

    public Employee(double s)
    {
        // calls the Employee(String, double) constructor
        this("Employee #" + nextId, s);
    }

    public Employee()
    {
        // name initialized to ""--see above
        // salary not explicitly set--initialized to 0
        // id initialized in initialization block
    }

    public String getName()
    {
        return name;
    }


    public double getSalary()
    {
        return salary;
    }


    public int getId()
    {
        return id;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject){
            return true;
        }
        if (otherObject == null) return false;
        if (this.getClass() != otherObject.getClass()) return false;
        // now we know otherObject is a non-null Employee
        Employee other = (Employee) otherObject;
        return Objects.equals(this.name, other.name) &&
                this.salary == other.salary &&
                Objects.equals(this.hireDay, other.hireDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.salary, this.hireDay);
    }

    @Override
    public String toString(){
        return "Employee [ Name : " +  this.name
                + ", Id : " + this.id
                + ", Salary : " + this.salary + "]";
    }

    public int compareTo(Employee other){
        return Double.compare(salary, other.salary);
    }
}
