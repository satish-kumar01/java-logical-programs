package com.satishit.logical.fifthset;

public class MaxMinOfGivenArray {
    public static void main(String[] args) {
        int[] a = {8,1,5,9,12,33,23,7,4,3};
        //Logic for finding the maximum number and minimum number in this array
        int max = a[0];
        int min = a[0];
        //length is the pre-defined variable in java
        for (int i=0;i<a.length;i++){
            if (max<a[i]){
                max=a[i];
            }
            if (min>a[i]){
                min=a[i];
            }
        }
        System.out.println("The maximum number in the given array is: "+max);
        System.out.println("The minimum number in the given array is: "+min);
    }
}
