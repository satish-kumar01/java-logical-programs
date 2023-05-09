package com.satishit.java8.predicate.predicatejoining;

import java.util.function.Predicate;

public class NamesStartsWithKByUsingPredicate {
    //Program to display names starts with 'K' by using Predicate
    public static void main(String[] args) {
        String[] names = {"Sunny","Kajal","Malika","Katrina","Kareena"};
        Predicate<String> startsWithK = s -> s.charAt(0) == 'K';
        System.out.println("The name starts with K are:");
        //for-each
        for (String s : names) {
            if (startsWithK.test(s)){
                System.out.println(s);
            }
        }
    }
}
