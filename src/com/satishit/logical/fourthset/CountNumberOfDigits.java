package com.satishit.logical.fourthset;

import java.util.Scanner;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any digit number:");
        int num = sc.nextInt();
        //Logic for counting the number of digits in the given inputed number
        int digitCOunt = 0;
        while (num>0){
            digitCOunt++;
            num=num/10;
        }
        System.out.println("The number of digits in the given number is: "+digitCOunt);
    }
}
