package com.satishit.logical.tenthset;

import java.util.Scanner;

public class CountNumberOfWordsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any statement having multiple words:"); // My name is satish kumar
        String str =sc.nextLine();
        //Logic for finding and printing the number of words in the given string text
        String[] strar = str.split(" ");
        System.out.println("The number of words in the given String text is: "+strar.length);
    }
}
