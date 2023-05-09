package com.satishit.interview.streams7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*Given an Employee List,
        1) sort employee based on their salaries in descending order,
        2) Fetch top 3 Salaried employee details.
        3) Fetch all employee having salary less than 3rd Highest salary. */
public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,500));
        employeeList.add(new Employee(2,1000));
        employeeList.add(new Employee(3,1500));
        employeeList.add(new Employee(4,2000));
        employeeList.add(new Employee(5,2500));
        employeeList.add(new Employee(6,3000));
        employeeList.add(new Employee(7,3500));

        List<Employee> empSortedList =
                employeeList.stream().sorted((o1, o2) -> (int)(o2.getSalary() - o1.getSalary()))
                .limit(3)
                .skip(3)
                .collect(Collectors.toList());
        System.out.println(empSortedList);
    }

}
