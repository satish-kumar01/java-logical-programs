package com.satishit.logical.thirdset;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int number = sc.nextInt();
        int a=1, b=1;
        System.out.println(a+" ");
        System.out.println(b+" ");
        int f=0;
        while (f<=number){
            f=a+b;
            if (f>number)
                break;
            System.out.println(f+" ");
            a = b;
            b = f;
        }
    }
}
