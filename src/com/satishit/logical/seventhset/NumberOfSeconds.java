package com.satishit.logical.seventhset;

import java.util.Scanner;

public class NumberOfSeconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number of seconds:"); //5000
        int totalSeconds = sc.nextInt();
        //Logic for calculating hours, minutes and seconds
        int minutes = totalSeconds/60;
        int remainingsSeconds = totalSeconds%60;
        int hours = minutes/60;
        int remainingMinutes = minutes%60;
        System.out.println(hours+":"+remainingMinutes+":"+remainingsSeconds);
    }
}
