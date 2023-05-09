package com.satishit.logical.secondset;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int number = sc.nextInt();
        System.out.println("Enter Power:");
        int power = sc.nextInt();
        int initialNumber = number;
        //Logic for Finding the power of the number
        for (int i =1; i<power; i++){
            //number = number * number; // here number will print 625 that is incorrect.
            number = initialNumber * number;
        }
        System.out.println(initialNumber+" power "+power+" is: "+number);
    }
}
