package com.satishit.logical.fourteenthset;

import java.util.Scanner;

public class GivenNumberIsPerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();
        //Logic for check whether the inputed number is a perfect no or not
        int sum = 0;
        for (int i=1;i<num;i++){
            if (num%i==0){
                sum = sum + i;
            }
        }
        if (num==sum){
            System.out.println("Given number is a Perfect Number");
        }else {
            System.out.println("Given number is not a Perfect Number");
        }
    }
}
