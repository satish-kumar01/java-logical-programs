package com.satishit.java8.primitivetype.function;


import java.util.function.Function;
import java.util.function.IntToDoubleFunction;

//Program to find square root of given integer by using Function
//Program to find square root of given integer by using IntToDoubleFunction
public class MyIntToDoubleFunction {
    public static void main(String[] args) {

        //Autoboxing and Autounboxing are degarde to performance
        /*Function<Integer,Double> f = i -> Math.sqrt(i);
        System.out.println(f.apply(5));*/

        IntToDoubleFunction f = i -> Math.sqrt(i);
        System.out.println(f.applyAsDouble(5));
        System.out.println(f.applyAsDouble(7));

    }

}
