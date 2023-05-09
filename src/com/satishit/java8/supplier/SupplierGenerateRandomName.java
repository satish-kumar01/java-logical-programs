package com.satishit.java8.supplier;

import java.util.function.Supplier;

//Program to get Random name(0to3) by using Supplier s1.0,s1.1,s1.2
public class SupplierGenerateRandomName {
    public static void main(String[] args) {
        Supplier<String> s = () -> {
            String[] s1 = {"Sunny","Bunny","Chinny","Vinny"};
            // Math.random() is always going to return 0<=x<1 => (0.9999)
            // Used Type Casting
            int x = (int) (Math.random()*4);  // 0<=x<1 => 0.9 * 4
            return s1[x];
        };
        System.out.println(s.get());
        //System.out.println(s.get());
        //System.out.println(s.get());
    }
}
