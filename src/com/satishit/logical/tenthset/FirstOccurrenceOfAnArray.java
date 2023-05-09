package com.satishit.logical.tenthset;

import java.util.Scanner;

public class FirstOccurrenceOfAnArray {
    public static void main(String[] args) {
        int[] a = {1,3,5,5,5,5,6,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:"); //5
        int num = sc.nextInt();
        //Logic for finding the first occurrence of the given number in the array
        //int size = a.length;
        boolean isFound = false;
        for (int i=0;i<a.length;i++){
            if (num==a[i]){
                System.out.println("The given number "+num+" is available in the array at the index: "+i);
                isFound = true;
                break;
            }
        }
        if (!isFound){
            System.out.println("The given number "+num+" is not available in the array");
        }
    }
}
