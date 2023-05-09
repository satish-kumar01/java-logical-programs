package com.satishit.logical.firstset;

import java.util.Scanner;

public class CheckVowelCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Character:");
        char c = sc.next().charAt(0);
        //Logic for checking whether the character entered by user is a vowel.
        boolean isVowel = false;
        switch (c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': isVowel = true;

        }
        if (isVowel){
            System.out.println(c+" is a vowel");
        }else {
            System.out.println(c+ " is not a vowel");
        }
    }
}
