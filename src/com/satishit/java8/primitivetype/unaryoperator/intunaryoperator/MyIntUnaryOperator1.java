package com.satishit.java8.primitivetype.unaryoperator.intunaryoperator;


import java.util.function.IntUnaryOperator;

//Program-1 for IntUnaryOperator:
public class MyIntUnaryOperator1 {
    public static void main(String[] args) {

        IntUnaryOperator f = i -> i*i;
        System.out.println(f.applyAsInt(100));

    }
}
