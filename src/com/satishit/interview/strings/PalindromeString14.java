package com.satishit.interview.strings;

import java.util.Scanner;

/*Q8)Q1)Write a java program to check whether a string is palindrome or not.
        -how to check whether a given input string is palindrome or not in a easy way.

        -> A palindrome number is a number that is same after reverse.
        Ex:-> 545, 151, 34543, 343, 171, 48984 are the palindrome numbers
        -> It can also be a string like LOL, MADAM etc.*/

public class PalindromeString14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any String::");
        String original = sc.nextLine();
        String reverse = "";
        for(int i = original.length()-1; i>=0; i--){
            reverse = reverse + original.charAt(i);
        }
        if(original.equals(reverse)){
            System.out.println("String "+original+" is Palindrome");
        }
        else{
            System.out.println("String "+original+" is Not Palindrome");
        }

    }
}
