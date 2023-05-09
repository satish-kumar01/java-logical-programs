package com.satishit.java8.primitivetype.predicate;

import java.util.function.IntPredicate;

public class MyIntPredicate {
    public static void main(String[] args) {
        int[] x = {0,5,10,15,20,25};
        IntPredicate p = i -> i%2==0;
        for (int x1 : x) {
            if(p.test(x1)){
                System.out.println(x1);
            }
        }
    }
}
