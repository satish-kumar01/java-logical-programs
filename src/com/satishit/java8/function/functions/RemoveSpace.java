package com.satishit.java8.function.functions;

import java.util.function.Function;

//Program to remove spaces present in the given String by using Function
public class RemoveSpace {
    public static void main(String[] args) {
        String s = "Welcome to satish it";
        Function<String,String> f = s1 -> s1.replaceAll(" ","");
        System.out.println(f.apply(s));
    }
}
