package com.satishit.interview.streamsjava8;

import java.util.Random;

//Generate Random integers within a Specific range in Java Using Java8.
public class GenerateRandomIntegers {
    public static void main(String[] args) {
        Random random = new Random();
        random.ints(1,5).forEach(System.out::println);

        /*random.ints(1,100).limit(10)
                .forEach(System.out::println);

        random.ints(1,100).limit(10)
                .sorted().forEach(System.out::println);

        random.ints(1,100).distinct().limit(10)
                .sorted().forEach(System.out::println);*/
    }
}
