package com.satishit.interview.streams9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*Write a java program, there is a list of Employees and
        the Candidate wants to Increase the salary of the Employees by 10%
        Whose age is Greater than 25 Years.*/
public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("ABC",22,10000));
        employeeList.add(new Employee("DEF",29,15000));
        employeeList.add(new Employee("HIJ",25,14000));
        employeeList.add(new Employee("MNO",26,17000));
        employeeList.add(new Employee("XYZ",21,19000));

        System.out.println("Original Salary::"+employeeList);

        List<Employee> incrementSalary =
                employeeList.stream().
                        map(e->
                        {
                            if (e.getAge()>25){
                                e.setSalary(e.getSalary()*1.10);
                            }
                            return e;
                        }).collect(Collectors.toList());
        System.out.println("Incremented Salary::"+incrementSalary);

    }
}
