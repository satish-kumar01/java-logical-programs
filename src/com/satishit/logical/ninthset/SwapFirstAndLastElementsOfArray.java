package com.satishit.logical.ninthset;

import java.util.Arrays;

public class SwapFirstAndLastElementsOfArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int size = a.length;
        int temp = a[0];
        a[0] = a[size-1];
        a[size-1] = temp;
        System.out.println(Arrays.toString(a));
    }
}
