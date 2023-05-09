package com.satishit.java8.primitivetype.function;

import java.util.function.Function;
import java.util.function.ToIntFunction;

//Program to find length of the given String by using Function
//Program to find length of the given String by using ToIntFunction
public class MyToIntFunction {
    public static void main(String[] args) {

        //Autoboxing and Autounboxing are degarde to performance
        /*Function<String,Integer> f= s-> s.length();
        System.out.println(f.apply("Satish"));*/

        ToIntFunction<String> f = s -> s.length();
        System.out.println(f.applyAsInt("Satish"));


    }
}
