package com.satishit.logical.fourthset;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Enter third number:");
        int c = sc.nextInt();
        //Logic for finding the largest of given three number
        if (a>b && a>c){
            System.out.println(a+" is the largest of given three numbers");
        } else if (b>c) {
            System.out.println(b+" is the largest of given three numbers");

        }else {
            System.out.println(c+" is the largest of given three numbers");
        }

    }

}
