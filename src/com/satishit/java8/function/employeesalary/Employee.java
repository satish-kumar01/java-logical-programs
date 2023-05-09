package com.satishit.java8.function.employeesalary;

//Progarm to find Total Monthly Salary of All Employees by using Function
public class Employee {
    String name;
    double salary;

    public Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    public String toString(){
        return name+":"+salary;
    }

}
