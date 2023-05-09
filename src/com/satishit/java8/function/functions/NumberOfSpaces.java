package com.satishit.java8.function.functions;

import java.util.function.Function;

//Program to find Number of spaces present in the given String by using Function
public class NumberOfSpaces {
    public static void main(String[] args) {
        //length of original string = 20
        //string length with spaces - string length without spaces = 20-17 =>
        String s = "Welcome to satish it";
        Function<String,Integer> f = s1 -> s1.length()-s1.replaceAll(" ","").length();
        System.out.println(f.apply(s));

    }
}
