package com.satishit.logical.ninthset;

import java.util.Scanner;

public class FirstHalfOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any text:"); // Flipkart
        String str = sc.nextLine();
        //Logic for printing the first half of the given string text
        int size = str.length();
        System.out.println("First half of the given string text is: "+str.substring(0, size/2));
    }
}
