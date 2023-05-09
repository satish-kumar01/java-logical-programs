package com.satishit.java8.biconsumer.employeesalary;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        BiFunction<String,Double,Employee> f = (name,salary) -> new Employee(name,salary);
        list.add(f.apply("Satish",1000.0));
        list.add(f.apply("Sunny",2000.0));
        list.add(f.apply("Bunny",3000.0));
        list.add(f.apply("Chinny",4000.0));

        BiConsumer<Employee,Double> c = (e,increment) -> e.salary = e.salary+increment;

        for (Employee e : list) {
            c.accept(e,500.0);
        }
        //Below code we can use through consumer as well
        for (Employee e : list) {
            System.out.println("Employee Name: "+e.name);
            System.out.println("Employee salary: "+e.salary);
            System.out.println();
        }
    }
}
