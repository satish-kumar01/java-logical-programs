package com.satishit.logical.ninthset;

import java.util.Arrays;

public class LeftRotateArrayBy1 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        //Logic for left rotating by 1 element
        int first = a[0];
        int size = a.length;
        for (int i=0;i<size-1;i++){ //4<4
            a[i] = a[i+1];
        }
        a[size-1] = first;
        System.out.println(Arrays.toString(a));
    }
}
