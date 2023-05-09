package com.satishit.java8.function.employeesalary;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeMain {
    public static void main(String[] args) {
        /*List<Employee> list = new ArrayList<>();
        populate(list);
        System.out.println(list);
        Function<List<Employee>,Double> f = list1 -> {
            double total = 0;

            for (Employee e : list1) {
                total = total+e.salary;
            }
            return total;
        };
        System.out.println("The total salary of this month: "+f.apply(list));*/

        //To perform Salary Increment for Employees by using Predicate & Function <3500
        List<Employee> list = new ArrayList<>();
        populate(list);
        System.out.println("Before increment:");
        System.out.println(list);

        Predicate<Employee> p = e -> e.salary<3500;
        Function<Employee,Employee> f = e -> {
            e.salary = e.salary+477;
            return  e;
        };
        List<Employee> l2 = new ArrayList<>();
        for (Employee e : list) {
            if (p.test(e)){
                f.apply(e);
                l2.add(e);
            }
        }
        System.out.println("After Incremented:");
        System.out.println(list);
        System.out.println("Employees with incremented salary:");
        System.out.println(l2);
    }
    public static void populate(List<Employee> list){
        list.add(new Employee("Sunny",1000));
        list.add(new Employee("Binny",2000));
        list.add(new Employee("Chinny",3000));
        list.add(new Employee("Pinny",4000));
        list.add(new Employee("Vinny",5000));

    }
}
