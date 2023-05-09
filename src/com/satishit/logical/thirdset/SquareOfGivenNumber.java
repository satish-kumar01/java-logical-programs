package com.satishit.logical.thirdset;

import java.util.Scanner;

public class SquareOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:"); //5
        int num = sc.nextInt();
        //Logic for finding the square of the given number
        System.out.println("The square of the given number is: "+(num*num));
    }
}
