package com.satishit.logical.eightset;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrayUsingCollections {
    public static void main(String[] args) {
        // Here we are using wrapper class of int = Integer[]
        Integer[] a = {5,2,4,6,1,8};
        // Convert this array into java collect list
        List<Integer> list = Arrays.asList(a);
        Collections.reverse(list);
        System.out.println(list);
    }
}
