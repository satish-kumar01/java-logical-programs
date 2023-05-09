package com.satishit.java8.predicate.employeemanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        populate(list);
        //System.out.println(list);

        Predicate<Employee> p1 = employee -> employee.designation.equals("Manager");
        System.out.println("Manager Information");
        display(p1,list);

        Predicate<Employee> p2 = employee -> employee.city.equals("Banglore");
        System.out.println("Banglore employee information");
        display(p2,list);

        Predicate<Employee> p3 = employee -> employee.salary<20000;
        System.out.println("All employee information whose salary < 20000:");
        display(p3,list);

        //Predicate joining - All managers from banglore
        System.out.println("All Managers from banglore to give pink slip:");
        display(p1.and(p2),list);

        //predicate joining - To select all emp who are managers or salary < 20000
        System.out.println("All emp who are managers or salary < 20000:");
        display(p1.or(p3),list);

        //predicate joining -to check all emp who are not managers
        System.out.println("All emp information who are not managers:");
        display(p1.negate(),list);

        //to represent CEO we are going to use predicate isEquals()
        Predicate<Employee> isCEO = Predicate.isEqual(new Employee("Satish","CEO",30000,"Banglorer"));
        Employee e1 = new Employee("Satish","CEO",30000,"Banglore");
        Employee e2 = new Employee("Pratik","Manager",20000,"Hyderabad");
        System.out.println(isCEO.test(e1)); //true
        System.out.println(isCEO.test(e2)); //false
        /*Employee e1 = new Employee("Satish","ceo",30000,"Chennai");
        Employee e2 = new Employee("Suuny","Manager",20000,"Hyderabad");
        list.add(e1);
        list.add(e2);
        System.out.println(list);*/
    }
    public static void display(Predicate<Employee>p, List<Employee> list){
        for (Employee e : list) {
            if (p.test(e)){
                System.out.println(e);
            }
        }
        System.out.println("**************************************");
    }
    public static void populate(List<Employee> list){
        list.add(new Employee("Satish","CEO",30000,"Banglore"));
        list.add(new Employee("Sunny","Manager",2000,"Banglore"));
        list.add(new Employee("Malika","Manager",5000,"Banglore"));
        list.add(new Employee("Kareena","Lead",5000,"Hyferabad"));
        list.add(new Employee("Anushka","Architect",6000,"Channai"));
        list.add(new Employee("Rashmi","lead",8000,"Delhi"));
        list.add(new Employee("Sowyma","lead",9000,"Hyderabad"));
        list.add(new Employee("Ramya","SE",6000,"UP"));
        //System.out.println(list);
    }
}
