package com.satishit.java8.function.functions;

import java.util.function.Function;

//Write a java program to find the square of given number by using function(I) java8
public class SquareOfNumber {
    public static void main(String[] args) {
        Function<Integer,Integer> f = i -> i*i;
        System.out.println(f.apply(10));
        System.out.println(f.apply(20));

    }
}
