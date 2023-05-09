package com.satishit.java8.function.functionchaining;

import java.util.function.Function;

public class MyFunctionChaining {
    public static void main(String[] args) {
        Function<String,String> f1 = s -> s.toUpperCase();
        // 0 to (9-1) => begin to end-1 => 0 to 8
        Function<String,String> f2 = s -> s.substring(0,9);

        System.out.println("The result of f1: "+f1.apply("Aishwaryaabhi"));
        System.out.println("The result of f2: "+f2.apply("Aishwaryaabhi"));

        System.out.println("The result of f1.andThen(f2): "+f1.andThen(f2).apply("Aishwaryaabhi"));
        System.out.println("The result of f1.compose(f2): "+f1.compose(f2).apply("Aishwaryaabhi"));

    }
}
