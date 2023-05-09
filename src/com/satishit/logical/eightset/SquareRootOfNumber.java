package com.satishit.logical.eightset;

import java.util.Scanner;

public class SquareRootOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:"); //4
        int num = sc.nextInt();
        //Logic for finding the square of the given number
        // type casting
        //int sqrtNum = (int)Math.sqrt(num);
        double sqrtNum = Math.sqrt(num);
        System.out.println("The square root of the given number is: "+sqrtNum);
    }
}
