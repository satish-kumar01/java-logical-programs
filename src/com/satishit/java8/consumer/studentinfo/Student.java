package com.satishit.java8.consumer.studentinfo;

//Student Information using Predicate, Function & Consumer
public class Student {
    String name;
    int marks;

    public Student(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
}

//If marks are >=60 then display student information. if marks >=60=> condition check (Predicate)
//To find grade of the student grade -> student(obj) -> grade(A) => Function
//To display student information => consumer is the best choice
