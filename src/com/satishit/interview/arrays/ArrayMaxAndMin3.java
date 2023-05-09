package com.satishit.interview.arrays;

/*Q3)Write a Java Program to Find Maximum and Minimum Elements from Given Array.
        int[] input = {6,5,2,9,10,12,7};
        Min = 2 & Max = 12*/

public class ArrayMaxAndMin3 {
    // Without using in-built method
    public static void main(String[] args) {
        int[] input = {-1,-2,4,5,6};
        findMax(input);
        findMin(input);
    }
    public static void findMax(int[] arr){
        int max = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max =" +max);
    }
    public static void findMin(int[] arr){
        int min = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Min =" +min);
    }
}
