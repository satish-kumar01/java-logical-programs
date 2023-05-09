package com.satishit.interview.streamsjava8;


/*Java8 Stream skip() and limit() method with an Example.
        Input: [5,13,21,13,27,59,59,34]
        Output: limit(3) -> [5,13,21]
        skip(4) -> [27,59,59,34]*/

import java.util.Arrays;
import java.util.List;

public class SkipLimitExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,13,21,13,27,59,59,34);
        //list.stream().limit(3).forEach(System.out::println);
        list.stream().skip(4).forEach(System.out::println);

    }
}
