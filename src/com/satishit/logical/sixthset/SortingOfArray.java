package com.satishit.logical.sixthset;

import java.util.Arrays;

public class SortingOfArray {
    public static void main(String[] args) {
        int[] a = {8,1,5,9,12,33,23,7,4,3};
        //Convert Arrays to toString()
        System.out.println("Before sorting the Array: "+Arrays.toString(a));
        Arrays.parallelSort(a);
        System.out.println("After sorting the Array: "+Arrays.toString(a));
    }
}
