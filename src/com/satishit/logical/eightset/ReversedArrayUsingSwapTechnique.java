package com.satishit.logical.eightset;

import java.util.Arrays;

public class ReversedArrayUsingSwapTechnique {
    public static void main(String[] args) {
        int[] ar = {4,3,2,1,5};
        int stratIndex = 0;
        int lastIndex = ar.length-1;
        int temp;
        while (stratIndex<lastIndex){
            temp = ar[stratIndex];
            ar[stratIndex] = ar[lastIndex];
            ar[lastIndex] = temp;
            stratIndex++;
            lastIndex--;
        }
        System.out.println(Arrays.toString(ar));
    }
}
