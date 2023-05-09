package com.satishit.interview.arrays;

public class ArrayMaxAndMin2 {
    // Without using in-built method
    public static void main(String[] args) {
        int[] arr = {-4,-1,-7,10,-8};
        //1 and 10
        int n =5;
        int min = arr[0], max = arr[0];
        for (int i=0;i<n;i++){
            if (arr[i]<min){
                min = arr[i];
            }
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(min +" "+max);
    }
}
