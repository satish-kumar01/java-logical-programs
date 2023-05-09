package com.satishit.interview.arrays;

import java.util.Arrays;
import java.util.Collections;
/*Q8)Write a Java Program to Sort an Array of Integers in Descending Order.
        Input:-  {13,7,6,45,21,9,10,102}
        Output:- [102, 45, 21, 13, 10, 9, 7, 6]

        There are two ways to solve this problem.
        ----------------------------------------
        1) Without using pre-defined method
        2) Using pre-defined method -> Arrays.sort(arr, Collections.reverseOrder());*/

public class ArraySortingDescendingOrder8 {
    public static void main(String[] args) {
        Integer[] arr = {13,7,6,45,21,9,10,102};

        //1) Without using pre-defined method
        //logic
        /*for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }*/
        System.out.println(Arrays.toString(arr));

        //2) Using pre-defined method
        //Sort array descending order
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.printf(Arrays.toString(arr));
    }
}
