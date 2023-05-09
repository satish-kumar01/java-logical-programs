package com.satishit.interview.streamsjava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Add Sum of Array to Each element of the array using Java8.
        Input: 10,20,30,40,50
        Sum = 150
        Output: 160,170,180,190,200  */
public class SumOfArray {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(10,20,30,40,50);
        Integer sum = number.stream().reduce(0, Integer::sum);

        List<Integer> list = number.stream().map(x->x+sum).collect(Collectors.toList());
        System.out.println(list);

    }
}
