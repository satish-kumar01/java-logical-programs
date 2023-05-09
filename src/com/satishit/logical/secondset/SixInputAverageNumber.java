package com.satishit.logical.secondset;

import java.util.Scanner;

public class SixInputAverageNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number:");
        int secondNumber = sc.nextInt();
        System.out.println("Enter third number:");
        int thirdNumber = sc.nextInt();
        System.out.println("Enter fourth number:");
        int fourthNumber = sc.nextInt();
        System.out.println("Enter fifth number:");
        int fixthNumber = sc.nextInt();
        System.out.println("Enter sixth number:");
        int sixthNumber = sc.nextInt();
        //Logic for finding the average of above inputed number
        System.out.println("The average of above inputed 6 number is: "
                +(firstNumber+secondNumber+thirdNumber+fourthNumber+fixthNumber+sixthNumber)/6.0);
    }
}
