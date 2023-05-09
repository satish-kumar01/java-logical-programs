package com.satishit.logical.fifthset;

import java.util.Arrays;

public class CompareTwoArrays {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {1,2,3,4};
        //Logic for checking whether these arrays are equal or not
        //In java there is Arrays class this arrays class having equals method
        // using this equals method we can compare two arrays
        if (Arrays.equals(a, b)){
            System.out.println("Both are arrays are equal");
        }else {
            System.out.println("The given arrays are not equal");
        }
    }
}
