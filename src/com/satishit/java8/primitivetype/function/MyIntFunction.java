package com.satishit.java8.primitivetype.function;

import java.util.function.Function;
import java.util.function.IntFunction;

//Program to find square of given integer by using Function
//Program to find square of given integer by using IntFunction
public class MyIntFunction {
    public static void main(String[] args) {

        //Autoboxing and Autounboxing are degarde to performance
        /*Function<Integer,Integer> f = i -> i*i;
        System.out.println(f.apply(5));*/

        //Integer = return type
        //Int = always take int value
        IntFunction<Integer> f = i -> i*i;
        System.out.println(f.apply(5));
    }
}
