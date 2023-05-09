package com.satishit.interview.streams3;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"AA",55000));
        list.add(new Employee(2,"BB",56000));
        list.add(new Employee(3,"CC",45000));
        list.add(new Employee(4,"DD",65000));
        list.add(new Employee(5,"EE",75000));
        list.add(new Employee(6,"FF",25000));

        Optional<Double> salary = list.stream().map(e -> e.getSalary()).sorted(Comparator.reverseOrder())
                .skip(2).findFirst();
        System.out.println(salary.get());


    }
}
