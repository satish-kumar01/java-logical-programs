package com.satishit.logical.sixthset;

import java.util.Scanner;

public class CompareTwoGivenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:"); //35
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number:"); //42
        int secondNumber = sc.nextInt();
        //Logic for comparing these two numbers
        if (firstNumber>secondNumber){
            System.out.println(firstNumber+" is greater than "+secondNumber);
        } else if (firstNumber<secondNumber) {
            System.out.println(firstNumber+" is less than "+secondNumber);
        } else /*if (firstNumber==secondNumber)*/ {
            System.out.println(firstNumber+" is equal to "+secondNumber);
        }
    }
}
