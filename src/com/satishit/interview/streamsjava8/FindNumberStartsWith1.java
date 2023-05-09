package com.satishit.interview.streamsjava8;

import java.util.Arrays;
import java.util.List;

/*Find out all the numbers Start with 1 Using Java8 Features.
        Input: [10,13,17,56,95,11]
        Output: [10,13,17,11]*/
public class FindNumberStartsWith1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,13,17,56,95,11);
        list.stream().map(s->s+" ").filter(s->s.startsWith("1")).forEach(System.out::println);
    }
}
