package com.satishit.interview.arrays;

public class ArrayBasics1 {
    public static void main(String[] args) {
        //creating array
        int[] arr = new int[3];

        //Initializing array
        arr[0] = 100;
        arr[1] = 101;
        arr[2] = 102;
        //arr[3] = 102; AIOB

        //accessing array values
        System.out.println(arr[0]); //100
        System.out.println(arr[1]); //101
        System.out.println(arr[2]); //102
        System.out.println(arr[3]); // AIOB
    }
}
