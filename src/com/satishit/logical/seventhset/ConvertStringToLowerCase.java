package com.satishit.logical.seventhset;

import java.util.Scanner;

public class ConvertStringToLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any statement:"); // I LoVE programming
        String originalStatement = sc.nextLine();
        //Logic for each and every word in the given statement into lower case
        System.out.println(originalStatement.toLowerCase());
    }
}
