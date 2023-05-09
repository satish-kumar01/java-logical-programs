package com.satishit.logical.sixthset;

import java.util.Scanner;

public class AsciiValueOfGivenCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character:");
        char ca = sc.nextLine().charAt(0);
        //Logic for printing the ASCII value of the given character
        int av = (int)ca;
        System.out.println("ASCII value of the given character is: "+av);
    }
}
