package com.satishit.logical.fifteenthset;

import java.util.Arrays;

public class ImplementBubbleSortAlgorithm {
    public static void main(String[] args) {
        int[] ar = {35,1,5,16,3,9,12};
        int temp;
        for (int i=0;i<ar.length;i++){ //0 1 2 3 4 5 6
            for (int j=0;j<ar.length-1-i;j++){
                if (ar[j]>ar[j+1]){
                    temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(ar));
    }
}
