package com.satishit.interview.streams4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* Employee has two fields name and city, There is a List of Employee with below Details.
        GroupBy Employee with the city.

        Input:
        Name= Sai   City=Hyd
        Name= Arjun City=Pune
        Name= Raju  City=Pune
        Name= Sam   City=Pune
        Name= Amar  City=Hyd

        Output:
        Hyd= Sai, Amar
        Pune= Arjun,Sam,Raju */

public class EmployeeGroupingBy {
    public static void main(String[] args) {
        Employee e1 = new Employee("Sai","Hyd");
        Employee e2 = new Employee("Arun","Pune");
        Employee e3 = new Employee("Sai","Pune");
        Employee e4 = new Employee("Sai","Pune");
        Employee e5 = new Employee("Sai","Hyd");

        List<Employee> employees = Arrays.asList(e1,e2,e3,e4,e5);
        employees.stream().collect(Collectors.groupingBy(Employee::getCity)).entrySet()
                .forEach(x->{
                    System.out.println(x.getKey()+"=");
                    System.out.println(x.getValue().stream().map(Employee::getName)
                            .collect(Collectors.joining()));
                });
    }
}
