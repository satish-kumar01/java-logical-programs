package com.satishit.java8.biconsumer;

import java.util.function.BiConsumer;

public class AcceptTwoStringValues {
    public static void main(String[] args) {
        BiConsumer<String,String> c = (s1,s2) -> System.out.println(s1+s2);
        c.accept("Satish","Kumar");
    }
}
