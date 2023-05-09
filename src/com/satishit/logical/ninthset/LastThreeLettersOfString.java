package com.satishit.logical.ninthset;

import java.util.Scanner;

public class LastThreeLettersOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string text:"); // Satish Kumar
        String str = sc.nextLine();
        //Logic for retrieving and printing the last three letters of the given string text
        char[] strca = str.toCharArray();
        int size = strca.length;
        String lastThreeLetters = "";
        //for loop for last index till the required index
        for (int i=size-1;i>size-4;i--){
            lastThreeLetters = strca[i] + lastThreeLetters;
        }
        System.out.println("Last three letters of the given string text is: "+lastThreeLetters);
    }
}
