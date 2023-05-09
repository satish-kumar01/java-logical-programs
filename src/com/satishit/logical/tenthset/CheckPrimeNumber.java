package com.satishit.logical.tenthset;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int number = sc.nextInt();
        //Logic for checking whether the given number ia a prime number or not
        boolean isPrime = true;
        if (number>1){
            for (int i=2;i<number;i++){
                if (number%2==0){
                    isPrime = false;
                }
            }
        }else {
            isPrime = false;
        }
        if (isPrime){
            System.out.println(number+" is a prime number");
        }else {
            System.out.println(number+" is not a prime number");
        }
    }
}
