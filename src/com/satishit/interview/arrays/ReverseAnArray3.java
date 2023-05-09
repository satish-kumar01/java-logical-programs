package com.satishit.interview.arrays;

import java.util.Arrays;

/*Q3)Write a Java Program to Reverse Given an Array.
        Input:  {1,2,3,4,5,6,7,8,9,10}
        Output: {10,9,8,7,6,5,4,3,2,1}

        Note:-In This case there are three(3) Approach are there.
        1)Using An Additional Array.
        2)Without Using an Additional Array OR Without Using Extra Memory Space
        3)Using Java8 Streams Appraoch.*/
public class ReverseAnArray3 {
      //1)Using An Additional Array.
    /*public static void main(String[] args) {
        //Input Array
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        //Method To Reverse Of An Array
        reverse(a);
    }
    public static void reverse(int[] a){
        int[] b = new int[a.length];
        int j = 0;

        for(int i = a.length-1; i>=0; i--){
            b[j] = a[i];
            j++;

        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }*/

    //2)Without Using an Additional Array OR Without Using Extra Memory Space
    public static void main(String[] args) {
        //input array
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        //Method to Reverse Of An Array
        reverse(a);
    }
    public static void reverse(int[] a){
        System.out.println(Arrays.toString(a));
        int start = 0;
        int end = a.length-1;
        int middle = a.length/2;

        int temp = 0;

        for (; start<middle;start++,end--){
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
        }
        System.out.println(Arrays.toString(a));
    }

    // 3)Using Java8 Streams Approach
    /*public static void main(String[] args) {
        //input array
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        //Method to Reverse Of An Array
        reverse(a);
    }
    public static void reverse(int[] a){
        System.out.println(Arrays.toString(a));
        Object[] revArr = IntStream.rangeClosed(1, a.length)
                .mapToObj(i -> a[a.length-i])
                .toArray();
        System.out.println(Arrays.toString(revArr));
    }*/
}
