package com.satishit.logical.ninthset;

import java.util.Arrays;

public class RightRotateArrayBy3 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        //Write the logic for right rotating the array by 1 element
        // {1,2,3,4,5} -> {5,1,2,3,4}
        int size = a.length;
        int n = 3;
        for (int j=1;j<=n;j++) {
            int last = a[size - 1];
            for (int i = size - 1; i > 0; i--) {
                a[i] = a[i-1];
            }
            a[0] = last;
        }
        System.out.println(Arrays.toString(a));
    }
}
