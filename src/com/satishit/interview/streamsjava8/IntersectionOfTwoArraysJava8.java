package com.satishit.interview.streamsjava8;

import java.util.Arrays;

public class IntersectionOfTwoArraysJava8 {
    public static void main(String[] args) {
        int[] firstArray = {1,2,3,3,1};
        int[] secondArray = {3,3};

        Arrays.stream(firstArray).filter(x->Arrays.stream(secondArray).anyMatch(y->y==x)).distinct()
                .forEach(System.out::println);

    }
}
