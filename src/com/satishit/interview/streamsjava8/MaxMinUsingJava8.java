package com.satishit.interview.streamsjava8;

import java.util.Arrays;
import java.util.List;

public class MaxMinUsingJava8 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(12,10,34,89,78);
        Integer min = values.stream().min((x,y) -> x.compareTo(y)).get();
        Integer max = values.stream().max((x,y)->x.compareTo(y)).get();

        System.out.println("The min value is: "+min);
        System.out.println("The max value is: "+max);

    }
}
