package com.satishit.logical.firstset;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Year:");
        int year = sc.nextInt();
        //Logic for checking whether the given year is a leap year or not
        boolean isLeapYear = false;

        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    isLeapYear = true;
                }else{
                    isLeapYear = false;
                }
            }else {
                isLeapYear = true;
            }
        }else{
            isLeapYear = false;
        }
        if (isLeapYear){
            System.out.println("Given Year "+ year + " is a leap year");
        }else {
            System.out.println("Given Year "+ year + " is not a leap year");
        }

    }
}
