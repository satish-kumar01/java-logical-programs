package com.satishit.java8.bifunction.employeeobject;

import java.util.function.BiFunction;

public class EmployeeMain {
    public static void main(String[] args) {
        // By taking these two obj as a argument and I want to provide monthly salary
        // I this requirement we can go through BiFunction
        BiFunction<Employee,TimeSheet,Double> f = (e,t) -> e.dailyWage*t.days;
        Employee e = new Employee(101,"Satish",1500);
        TimeSheet t = new TimeSheet(101,30);

        System.out.println("Employee Monthly Salary: "+f.apply(e,t));

    }

}
