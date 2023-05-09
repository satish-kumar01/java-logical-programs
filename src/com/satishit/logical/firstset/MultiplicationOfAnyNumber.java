package com.satishit.logical.firstset;

import java.util.Scanner;

public class MultiplicationOfAnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();
        // Logic for multiplication table of any number
        for(int i = 1; i<=10; i++){
            System.out.println(num+" * "+i+" = "+(num*i));
        }
    }
}
