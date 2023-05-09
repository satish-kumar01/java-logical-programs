package com.satishit.logical.eightset;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:"); //6
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number:"); //12
        int secondNumber = sc.nextInt();
        //Logic for finding the greatest common divisor of given two numbers
        int gcd = 0;
        for (int i=1;i<=firstNumber && i<=secondNumber;i++){
            if (firstNumber%i==0 && secondNumber%i==0){
                gcd = i;
            }
        }
        System.out.println("The greatest common divisor of given number is: "+gcd);
    }
}
