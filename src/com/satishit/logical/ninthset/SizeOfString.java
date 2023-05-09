package com.satishit.logical.ninthset;

import java.util.Scanner;

public class SizeOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string text:");
        String str = sc.nextLine();
        //Logic for finding the size or length of the given string text
        System.out.println("The size or length of the given String text is: "+str.length());
    }
}
