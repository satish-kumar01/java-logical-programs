package com.satishit.logical.secondset;

import java.util.Scanner;

public class FindQquotientAndReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int firstNumber = sc.nextInt();
        System.out.println("Enter Second Number:");
        int secondNumber = sc.nextInt();
        // Logic for Quotient
        System.out.println("Quotient is: "+(firstNumber/secondNumber));
        //Logic for Remainder
        System.out.println("Remainder is: "+(firstNumber%secondNumber));
    }

}
