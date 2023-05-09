package com.satishit.logical.thirdset;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string text:"); //MADAM
        String originalText = sc.nextLine();
        //Logic for reversing the string text
        char[] ca = originalText.toCharArray();
        int size = ca.length;
        String reversedText = "";
        for (int i=size-1;i>=0;i--){
            reversedText=reversedText+ca[i];
        }
        //Logic for comparing original with reversed text
        if (originalText.equals(reversedText)){
            System.out.println(originalText+" is a palindrome");
        }else {
            System.out.println(originalText+" is not a palindrome");
        }
    }
}
