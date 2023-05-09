package com.satishit.java8.consumer.myconsumer;

import java.util.function.Consumer;

public class MyConsumer {
    public static void main(String[] args) {
        Consumer<String> c = s -> System.out.println(s);
        c.accept("Hello");
        c.accept("Satish IT");
    }
}
