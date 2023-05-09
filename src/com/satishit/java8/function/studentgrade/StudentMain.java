package com.satishit.java8.function.studentgrade;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        populate(list);
              /* marks  grade  result
                >=80 => A -> Distinction
                >=60 => B -> First
                >=50 => C -> Second
                >=35 => D -> Third
                <35 => E -> Fail */
        Function<Student, String> f = s -> {
            int marks = s.marks;
            if (marks >= 80) {
                return "A[Distinction]";
            } else if (marks >= 60) {
                return "B[First]";
            } else if (marks >= 50) {
                return "c[Second]";
            } else if (marks >= 35) {
                return "D[Third]";
            } else {
                return "Fasiled";
            }
        };
        //To find Students Information including Grade by using Function whose marks are >=60
        Predicate<Student> p = s -> s.marks>=60;

        for (Student s : list) {
            if (p.test(s)) {
                System.out.println("Student name: " + s.name);
                System.out.println("Student marks: " + s.marks);
                System.out.println("Student Grade: " + f.apply(s));
                System.out.println();
            }
        }
    }
    public static void populate(List<Student> list){
        list.add(new Student("Sunny",100));
        list.add(new Student("Bunny",65));
        list.add(new Student("Chinny",55));
        list.add(new Student("Vinny",45));
        list.add(new Student("Pinny",25));
    }
}
