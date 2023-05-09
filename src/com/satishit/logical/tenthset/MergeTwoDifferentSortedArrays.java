package com.satishit.logical.tenthset;

import java.util.Arrays;

public class MergeTwoDifferentSortedArrays {
    public static void main(String[] args) {
        int[] a = {1,2,3}; //i
        int[] b = {2,4,6,8}; //j
        int as = a.length;
        int bs = b.length;

        int[] c = new int[as+bs]; //k
        int i = 0;
        int j = 0;
        int k = 0;
        while (i<as && j<bs){
            if (a[i]<=b[j]){
                c[k] = a[i];
                i++;
                k++;
            }else {
                c[k] = b[j];
                j++;
                k++;
            }
        }
        while (i<as){
            c[k] = a[i];
            i++;
            k++;
        }
        while (j<bs){
            c[k] = b[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(c));
    }
}
