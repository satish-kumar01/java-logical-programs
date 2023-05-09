package com.satishit.logical.eightset;

import java.util.Arrays;
import java.util.Scanner;

public class SavingArray {
    public static void main(String[] args) {
        //Code for in taking the size of the array from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:"); //5
        int size = sc.nextInt();
        //Crate an array
        int[] ar = new int[size];
        //Code for in taking  the array elements from the user based on the earlier provided size
        for (int i=0;i<size;i++){
            System.out.println("Enter number:"); // 1
            ar[i] = sc.nextInt();

        }
        //Print the array here
        System.out.println(Arrays.toString(ar));
    }
}
