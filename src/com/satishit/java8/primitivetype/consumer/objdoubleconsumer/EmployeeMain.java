package com.satishit.java8.primitivetype.consumer.objdoubleconsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.ObjDoubleConsumer;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        populate(list);

        //Normal Bi Consumer It is not primitive version
        //Autoboxing performance is going to down

        /*BiConsumer<Employee,Double> c = (e,d) -> e.salary=e.salary+d;
        Employee e = new Employee("Satish",1000);
        c.accept(e,500.0);*/

        ObjDoubleConsumer<Employee> c = (e,d) -> e.salary = e.salary+d;
        for (Employee e : list) {
            c.accept(e,500.0);
        }
        for (Employee e : list) {
            System.out.println("Employee Name: "+e.name);
            System.out.println("Employee Salary: "+e.salary);
            System.out.println();
        }

    }

    public static void populate(List<Employee> list){
        list.add(new Employee("Satish",1000));
        list.add(new Employee("Sunny",2000));
        list.add(new Employee("Bunny",3000));
        list.add(new Employee("Chinny",4000));
        list.add(new Employee("Vinny",5000));
    }

}
