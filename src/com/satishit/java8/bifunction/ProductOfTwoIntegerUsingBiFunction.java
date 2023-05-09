package com.satishit.java8.bifunction;

import java.util.function.BiFunction;
//To find product of 2 given integers by using BiFunction
public class ProductOfTwoIntegerUsingBiFunction {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> f = (a,b) -> a*b;
        System.out.println(f.apply(10,20));
        System.out.println(f.apply(100,200));
    }
}
