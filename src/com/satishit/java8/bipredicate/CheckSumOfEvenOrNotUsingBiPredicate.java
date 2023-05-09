package com.satishit.java8.bipredicate;

import java.util.function.BiPredicate;

// To check the sum of 2 given integers is even or not by using BiPredicate
public class CheckSumOfEvenOrNotUsingBiPredicate {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> p = (a,b) -> (a+b)%2 == 0;
        System.out.println(p.test(10,20)); // true
        System.out.println(p.test(15,20)); //false
    }
}
