package com.satishit.logical.thirdset;

import java.util.Scanner;

public class CubeOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:"); // 5
        int num = sc.nextInt();
        //Logic for finding the cube of the given number
        System.out.println("Cube of given number is "+(num*num*num));
    }
}
