package com.satishit.logical.seventhset;

import java.util.Scanner;

public class NumberOfFactorsGivenNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:"); //12
        int num = sc.nextInt();
        //Logic for finding the different factors of given number
        int count = 0;
        System.out.println("The below are the different factors of the given number:");
        for (int i=1;i<=num;i++){
            if (num%i==0){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println("The number of factors for the given number are: "+count);
    }
}
