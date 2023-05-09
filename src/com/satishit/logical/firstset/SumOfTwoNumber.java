package com.satishit.logical.firstset;

import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int firstNumber = sc.nextInt();
        System.out.println("Enter Second Number:");
        int secondNumber = sc.nextInt();
        System.out.println("The sum of "+firstNumber+" and "+secondNumber+ " is: "+(firstNumber+secondNumber));
    }
}
