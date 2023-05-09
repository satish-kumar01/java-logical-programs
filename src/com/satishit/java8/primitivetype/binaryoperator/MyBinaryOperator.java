package com.satishit.java8.primitivetype.binaryoperator;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class MyBinaryOperator {
    public static void main(String[] args) {
        //BiFunction
        /*BiFunction<String,String,String> f = (s1,s2) -> s1+s2;
        System.out.println(f.apply("Satish","IT"));*/

        BinaryOperator<String> b = (s1,s2) -> s1+s2;
        System.out.println(b.apply("Satish","It"));
    }
}
