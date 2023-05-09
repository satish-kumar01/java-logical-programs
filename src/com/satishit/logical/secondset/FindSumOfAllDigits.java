package com.satishit.logical.secondset;

import java.util.Scanner;

public class FindSumOfAllDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any digit number:");
        int number = sc.nextInt(); //5124
        int sum = 0;
        // Logic for adding all the digits in the given inputed number
        while (number!=0){
            int reminder = number%10;

            sum = sum + reminder;

            number = number/10;
        }
        System.out.println("Sum of all the digits in the given number is: "+sum);
    }
}
