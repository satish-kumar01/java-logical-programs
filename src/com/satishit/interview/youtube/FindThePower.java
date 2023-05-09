package com.satishit.interview.youtube;

import java.util.Scanner;
/*Write a Program to Find the Power(a,b) Where a and b are two Integers.
        Input: B=2, P=3
        Output: 8, (2^3=2*2*2=8)  */

public class FindThePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number::");
        int b = sc.nextInt();
        System.out.println("Enter any power::");
        int p = sc.nextInt();

        int power = power(b,p);

        System.out.println("b:"+b+", p:"+p);
        System.out.println("Power: "+power);

    }
    private static int power(int b,int p){
        int power = 1;
        for (int i=1;i<=p;i++){
            power = power * b;
        }
        return power;
    }
}
