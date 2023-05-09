package com.satishit.java8.dateandtimeapi;

import java.time.Year;
import java.util.Scanner;

//write a program to check the given year is leap year or not
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year Number:");
        int n = sc.nextInt();
        //int n = Integer.parseInt(args[0]);
        Year y = Year.of(n);
        //isLeap() factory method
        if (y.isLeap()){
            System.out.printf("%d Year is Leap year",n);
        }else {
            System.out.printf("%d Year is not Leap year",n);
        }
    }
}
