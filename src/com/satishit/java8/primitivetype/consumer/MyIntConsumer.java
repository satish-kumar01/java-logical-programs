package com.satishit.java8.primitivetype.consumer;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class MyIntConsumer {
    public static void main(String[] args) {

        ////Autoboxing and Autounboxing are degarde to performance
        /*Consumer<Integer> c = i -> System.out.println(i*i);
        c.accept(10);*/

        IntConsumer c = i -> System.out.println("The Square of i: "+(i*i));
        c.accept(10);
    }
}
