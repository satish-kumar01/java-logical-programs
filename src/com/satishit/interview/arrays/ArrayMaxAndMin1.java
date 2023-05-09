package com.satishit.interview.arrays;

import java.util.Arrays;

/*Q4)Write a Java Program to Find Maximum and Minimum Elements from Given Array.
        Ex:- int[] input = {6,5,2,9,10,12,7};

        Min = 2 & Max = 12

        -> There are 2-Ways to solve this problem
           --------------------------------------
        1) Using in-built method
        2) Without using in-built method*/
public class ArrayMaxAndMin1 {
    // 1) Using in-built method
    public static void main(String[] args) {
        //1.Using inbuilt method
        int[] arr = {4,1,7,10,8};
        // 1 and 10
        int n = 5;
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[n-1];
        System.out.println(min +" "+max);
    }
}
