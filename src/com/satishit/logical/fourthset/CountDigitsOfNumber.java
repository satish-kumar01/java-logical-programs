package com.satishit.logical.fourthset;

import java.util.Scanner;

public class CountDigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any digit number:"); //5412
        int num = sc.nextInt();
        //Logic for counting the digits in the given number
        int sumOfDigits = 0;

        while (num>0){
            int reminder = num%10;
            sumOfDigits = sumOfDigits+reminder;
            num = num/10;
        }
        System.out.println("The sum of digits in the given number is: "+sumOfDigits);

    }
}
