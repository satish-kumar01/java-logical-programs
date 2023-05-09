package com.satishit.interview.streamsjava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*How to get unique Value from ArrayList Using Java8.
        Input: [1,2,3,1,3,4,5]
        Output: [1,2,3,4,5]*/
public class UniqueValueArrayList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,1,3,4,5);
        List<Integer> unique = list.stream().distinct().collect(Collectors.toList());
        System.out.println(unique);
    }

}
