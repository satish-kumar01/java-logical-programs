package com.satishit.interview.youtube;

import java.util.ArrayList;
import java.util.Collections;

/*How to sort an ArrayList in Descending Order in Java.
        Input: AA,ZZ,CC,FF
        Output: ZZ,FF,CC,AA     */
public class ArrayListDesOrder {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("AA");
        list.add("ZZ");
        list.add("CC");
        list.add("FF");
        System.out.println("Unsorted ArrayList:: "+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Sorted ArrayList"+" in Descending Order"+list);
    }
}
