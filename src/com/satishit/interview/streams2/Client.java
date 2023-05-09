package com.satishit.interview.streams2;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"Pratik",1000));
        list.add(new Employee(3,"Suman",2000));
        list.add(new Employee(2,"vasu",3000));
        list.add(new Employee(1,"nag",4000));

        //display list names whose salary is greater than 2000

        /*list.stream().filter(x->x.getSalary()>2000).forEach(
                (x) ->
                {
                    System.out.println(x);
                });*/

        //display emp count whose salary is greater than 2000

        /*long count = list.stream().filter(x -> x.getSalary() > 2000).count();
        System.out.println(count);*/

        //Finding emp name whose having high salary

        Optional<Employee> max = list.stream().max(Comparator.comparing(Employee::getSalary));
        //System.out.println(max);
        System.out.println(max.get());
    }
}
