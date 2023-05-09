package com.satishit.java8.bifunction.studentobject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        BiFunction<String,Integer,Student> f = (name,rollNo) -> new Student(name,rollNo);
        list.add(f.apply("satish",100));
        list.add(f.apply("Ravi",200));
        list.add(f.apply("Shiva",300));

        //print these students
        for (Student s : list) {
            System.out.println("Name is: "+s.name);
            System.out.println("Roll No is: "+s.rollNo);
            System.out.println();
        }

    }
}
