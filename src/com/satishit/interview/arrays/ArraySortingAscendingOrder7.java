package com.satishit.interview.arrays;

import java.util.Arrays;
/*Q7)Write a Java Program to Sort an Array of Integers in Ascending Order.
        Input:-  {13,7,6,45,21,9}
        Output:- [6, 7, 9, 13, 21, 45]

        There are two ways to solve this problem.
        ----------------------------------------
        1) Without using pre-defined method
        2) Using pre-defined method -> (Arrays.sort(arr);)*/

public class ArraySortingAscendingOrder7 {
    public static void main(String[] args) {
        //input array(Our array contains 8-elements)
        int[] arr = {13,7,6,45,21,9};
        // 1) Without using pre-defined method
        //logic
        /*for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }*/
        System.out.println(Arrays.toString(arr));

        //2) Using pre-defined method
        Arrays.sort(arr);
        System.out.printf(Arrays.toString(arr));

    }
}
