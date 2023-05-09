package com.satishit.logical.fourthset;

import java.util.Scanner;

public class FactorialOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:"); //5
        int num = sc.nextInt();
        //Logic for finding the factorial of the given number
        int fact = factorial(num);
        System.out.println("Fctorial of the given number "+ num+ " is "+fact);
    }
    public static int factorial(int n){
        if (n==0){
            return 1;
        }else {
            return n*factorial(n-1); // 120
        }

    }

}
