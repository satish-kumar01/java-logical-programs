package com.satishit.logical.twelvthset;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagramOfStringOfAnotherStringUsingSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:"); //BAT
        String str1 = sc.nextLine().toLowerCase().replaceAll("\\s","");
        System.out.println("Enter second string:"); //TAB
        String str2 = sc.nextLine().toLowerCase().replaceAll("\\s","");
        if (isAnagram(str1,str2)){
            System.out.println("Given string "+str1+" is an Anagram of String "+str2);
        }else {
            System.out.println("Given string "+str1+" is not an Anagram of String "+str2);
        }

    }
    public static boolean isAnagram(String str1, String str2){
        char[] ca1 = str1.toCharArray();
        char[] ca2 = str2.toCharArray();

        Arrays.sort(ca1);
        Arrays.sort(ca2);

        return Arrays.equals(ca1,ca2);
    }
}
