package com.satishit.logical.fifteenthset;

import java.util.Scanner;

public class ImplementLinearSearchAlgorithm {
    public static void main(String[] args) {
        int[] ar = {55,2,9,3,5,7,99,24,36,49,86};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number for searching in the array"); //99 25
        int num = sc.nextInt();
        //Logic for linear search algorithm
        int count = 0;
        for (int i=0;i<ar.length;i++){
            if (num==ar[i]){
                System.out.println("Given number "+num+" is available at the index "+i+" of the array");
                count++;
                break;
            }
        }
        if (count==0){
            System.out.println("Given number "+num+" is not available in the array");
        }
    }
}
