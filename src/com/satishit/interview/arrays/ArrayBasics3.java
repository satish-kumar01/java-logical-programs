package com.satishit.interview.arrays;

import java.util.stream.Stream;
/*
    How to traverse an array?
        we can traverse an array in below ways
            Approach-1: For loop
            Approach-2: For Each Loop
            Approach-3: Streams
*/
public class ArrayBasics3 {
    public static void main(String[] args) {
        String[] names = {"sachin", "ganguly", "sehwag"};

        System.out.println("===========Approach-1======================");
        for (int i=0; i<names.length;i++){
            System.out.println(names[i]);
        }
        System.out.println("===========Approach-2=====================");
        for (String name : names){
            System.out.println(name);
        }
        System.out.println("===========Approach-3=====================");
        Stream.of(names).forEach(name-> System.out.println(name));

        System.out.println("===========Reverse Order(Backward Direction)===========");
        for (int i=names.length-1; i>=0; i--){
            System.out.println(names[i]);
        }
    }
}
