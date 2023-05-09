package com.satishit.interview.arrays;

/*Q5)Write a Java Program to Find Missing Number in the Given an Array.

        Input:  {1,2,3,5,6,7,8}
        Output: 4
        There are 3-ways to solve this problem
        --------------------------------------
        1) Sum of first natural no formula
        2) Hashing
        3) Sort the array and play with indexes.*/

public class FindMissingNumber5 {
    public static void main(String[] args) {
        int[] arr = {10,8,9,5,1,3,2,7,6};
        for (int i=1;i<=10;i++){
            boolean isPresent = check(arr, i);
            if (isPresent==false){
                System.out.println(i);
                break;
            }
        }
    }
    public static boolean check(int[] arr, int i){
        for (int j=0;j<arr.length;j++){
            if (arr[j] == i){
                return true;
            }
        }
        return false;
    }
}
