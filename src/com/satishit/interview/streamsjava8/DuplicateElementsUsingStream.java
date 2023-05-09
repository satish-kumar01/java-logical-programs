package com.satishit.interview.streamsjava8;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*How to Find Duplicate Elements in a given Integers List in Java Using Stream Function.
        Input: [5,13,21,13,27,59,59,34]
        Output: [58,13]*/
public class DuplicateElementsUsingStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,13,21,13,27,59,59,34);
        Set<Integer> set = new HashSet<>();
        list.stream().filter(s->!set.add(s)).collect(Collectors.toSet()).forEach(System.out::println);
    }
}
