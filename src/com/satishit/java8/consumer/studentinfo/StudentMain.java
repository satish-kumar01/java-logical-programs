package com.satishit.java8.consumer.studentinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        populate(list);

        Predicate<Student> p = s -> s.marks>=60;
        Function<Student,String> f = s -> {
          int marks = s.marks;
          if (marks>=80){
              return "A";
          } else if (marks>=60) {
              return "B";
          } else if (marks>=50) {
              return "C";
          } else if (marks>=35) {
              return "D";
          }else {
              return "Failed";
          }
        };
        Consumer<Student> c = s -> {
            System.out.println("Student Name: "+s.name);
            System.out.println("Student Marks: "+s.marks);
            System.out.println("Student Grade: "+f.apply(s));  //Function Concept
            System.out.println();
        };
        for (Student s : list) {
            c.accept(s);
            /*if (p.test(s)){  //Predicate Concept
                              //Consumer Concept
            }*/
        }
    }

    public static void populate(List<Student> list){
        list.add(new Student("Suuny",100));
        list.add(new Student("Bunny",65));
        list.add(new Student("Chinny",55));
        list.add(new Student("Vinny",45));
        list.add(new Student("Pinny",25));
    }
}


