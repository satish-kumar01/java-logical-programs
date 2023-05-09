package com.satishit.logical.fifteenthset;

import java.util.Arrays;

public class ImplementInsertionSortAlgorithm {
    public static void main(String[] args) {
        int[] ar = {35,1,5,16,3,9,12};
        int current;
        int j;
        for (int i=1;i<ar.length;i++){
            current = ar[i];  //element
            j = i; //index
            while (j>0 && ar[j-1]>current){
                ar[j] = ar[j-1];
                j--;
            }
            ar[j] = current;
        }
        System.out.println(Arrays.toString(ar));
    }
}
