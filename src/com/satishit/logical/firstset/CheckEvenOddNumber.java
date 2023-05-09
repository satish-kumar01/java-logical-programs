package com.satishit.logical.firstset;

import java.util.Scanner;

public class CheckEvenOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number:");
        int num = sc.nextInt();
        // Write the logic check whether number entered by user is even or odd
        if(num%2==0){
            System.out.println(num+" number given by user is an even number");
        }else {
            System.out.println(num+" number given by user is an odd number");
        }

    }
}
