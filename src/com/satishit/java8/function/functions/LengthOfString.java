package com.satishit.java8.function.functions;

import java.util.function.Function;
//Write a function to find length of given input string.
public class LengthOfString {
    public static void main(String[] args) {
        Function<String, Integer> f = s -> s.length();
        System.out.println(f.apply("Satish"));
        System.out.println(f.apply("Satish IT"));
    }
}
