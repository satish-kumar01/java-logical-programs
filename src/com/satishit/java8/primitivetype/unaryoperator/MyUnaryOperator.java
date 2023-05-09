package com.satishit.java8.primitivetype.unaryoperator;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MyUnaryOperator {
    public static void main(String[] args) {
        ////Function<T,R>
        /*Function<Integer,Integer> f = i -> i*i;
        System.out.println(f.apply(10));*/

        //UnaryOperator
        //Autoboxing and Autounboxing problem
        UnaryOperator<Integer> o = i -> i*i;
        System.out.println(o.apply(10));


    }
}
