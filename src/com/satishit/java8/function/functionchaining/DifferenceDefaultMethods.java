package com.satishit.java8.function.functionchaining;

import java.util.function.Function;

public class DifferenceDefaultMethods {
    public static void main(String[] args) {
        Function<Integer,Integer> f1 = i -> i+i; //2+2=4
        Function<Integer,Integer> f2 = i -> i*i*i; //4*4*4 = 64

        System.out.println(f1.andThen(f2).apply(2)); //4*4*4 = 64
        System.out.println(f1.compose(f2).apply(2)); // 8+8 =16
    }
}
