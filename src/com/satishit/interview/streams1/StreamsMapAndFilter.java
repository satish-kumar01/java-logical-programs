package com.satishit.interview.streams1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMapAndFilter {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(0);
        l1.add(10);
        l1.add(20);
        l1.add(5);
        l1.add(25);
        System.out.println(l1);

        //Can you please l1 out or filter the elements for all even numbers in the above l1 into new l1

        //Without streams until 1.7V
        /*List<Integer> l = new ArrayList<>();
        for (Integer i : l1) {
            if (i%2==0){
                l1.add(i);
            }
        }
        System.out.println(l1);*/

        //with streams from 1.8V onwards, boolean condition is checking for even or not -> i -> i%2==0
        /*List<Integer> l2 = l1.stream().filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println(l2);*/

        //For every element present in the collection,perform some operation like addition,division,multiplication
        //for every element.
        //Can you please create new element by performing the particular operation.

        //In the collection there are some integers are there,I want new collection object where each and every
        //element is double value of original collection.

        //without streams until 1.7V
        /*List<Integer> l3 = new ArrayList<>();
        for (Integer i: l3) {
            l3.add(i*2);
        }
        System.out.println(l3);*/

        //with stream from 1.8 version,  Function -> I -> I*2
        List<Integer> l3 = l1.stream().map(I -> I*2).collect(Collectors.toList());
        System.out.println(l3);
    }
}
