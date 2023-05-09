package com.satishit.logical.thirdset;

import java.util.Scanner;

public class PalindromeInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:"); // 1991
        int originalNumber = sc.nextInt();
        int number = originalNumber;
        int reversedNumber = 0;
        //Logic for reversing the given number
        while (number!=0){
            int reminder = number%10;
            reversedNumber = reversedNumber*10+reminder;
            number = number/10;
        }
        //Checking whether the given number is a palindrome
        if (originalNumber==reversedNumber){
            System.out.println(originalNumber+" is a palindrome");
        }else {
            System.out.println(originalNumber+" is not a palindrome");
        }
    }
}
