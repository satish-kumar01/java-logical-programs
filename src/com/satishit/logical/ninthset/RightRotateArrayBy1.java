package com.satishit.logical.ninthset;

import java.util.Arrays;

public class RightRotateArrayBy1 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int size = a.length;
        int last = a[size-1]; //size-1=> 5-1

        for (int i=size-1;i>0;i--){
            a[i] = a[i-1];
        }
        a[0] = last;
        System.out.println(Arrays.toString(a));
    }
}
