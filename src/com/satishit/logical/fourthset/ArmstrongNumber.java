package com.satishit.logical.fourthset;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter any number:"); // 123
        int num = sc.nextInt();
        int originalNumber = num;
        int cubedNum = 0;
        //Logic for checking whether the given number is armstrong number
        while (num>0){
            int reminder = num%10;
            cubedNum = cubedNum+(reminder*reminder*reminder);
            num = num/10;
        }
        //To check whether the original number is armstrong number or not
        if (originalNumber==cubedNum){
            System.out.println(originalNumber+" is an Armstrong number");
        }else {
            System.out.println(originalNumber+" is not an Armstrong number");
        }
    }
}
