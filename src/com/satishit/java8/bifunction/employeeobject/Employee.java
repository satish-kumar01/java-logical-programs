package com.satishit.java8.bifunction.employeeobject;

//To calculate Monthly Salary with Employee and TimeSheet objects as input By using BiFunction
public class Employee {
    int empNo;
    String name;
    double dailyWage;

    public Employee(int empNo,String name,double dailyWage){
        this.empNo=empNo;
        this.name=name;
        this.dailyWage=dailyWage;
    }
}
