package com.satishit.java8.predicate.predicatejoining;

import java.util.function.Predicate;

public class MyPredicateJoining {
    public static void main(String[] args) {
        int[] x = {0,5,10,15,20,25,30};
        //check whether the given number greater than 10 or not?
        Predicate<Integer> p1 = i -> i>10;
        //Is even number?
        Predicate<Integer> p2 = i -> i%2==0;

        System.out.println("The numbers greater than 10 Are:");
        m1(p1,x);

        System.out.println("The even numbers are:");
        m1(p2,x);

        System.out.println("The numbers not greater than 10:");
        m1(p1.negate(),x);

        System.out.println("The numbers greater than 10 and even are:");
        m1(p1.and(p2),x);

        System.out.println("The numbers greater than 10 or even are:");
        m1(p1.or(p2),x);


    }
    public static void m1(Predicate<Integer> p, int[] x){
        //for-each
        for (int x1 : x) {
            if (p.test(x1)){
                System.out.println(x1);
            }
        }
    }
}
