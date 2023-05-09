package com.satishit.java8.primitivetype.binaryoperator;

import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class MyIntBinaryOperator {
    public static void main(String[] args) {
        //Normal Binary Operator Autoboxing problem
        /*BinaryOperator<Integer> b = (i1,i2) -> i1+i2;
        System.out.println(b.apply(10,20));*/

        //IntBinaryOperator
        IntBinaryOperator b = (i1, i2) -> i1+i2;
        System.out.println(b.applyAsInt(10,20));
    }
}
