package com.satishit.interview.arrays;

/*
Types of Arrays:
        1) Single dimensional Arrays
        2) Multi Dimensional Arrays
*/
public class ArrayBasics4 {
    public static void main(String[] args) {
        int[][] arr = new int[2][2];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;

        for (int[] ar : arr){
            for (int a : ar){
                System.out.println(a);
            }
        }
    }

}
