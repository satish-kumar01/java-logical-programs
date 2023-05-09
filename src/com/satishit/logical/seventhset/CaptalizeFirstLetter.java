package com.satishit.logical.seventhset;

import java.util.Scanner;

public class CaptalizeFirstLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any statement:"); // My name is satish kumar
        String originalStatement = sc.nextLine();
        //Logic for captalizing each and evrey word of the given statement
        String[] words = originalStatement.split(" "); //{"My","name","is","satish","kumar"}
        String finalStatement = "";
        //for-each loop to iterate of each and every word
        for (String word : words) {
            char[] ca = word.toCharArray();
            char c = ca[0];
            // valueOf() - converting char to string
            String firstCharacter = String.valueOf(c).toUpperCase();
            String capitializedWord = firstCharacter;
            // for-loop
            for (int i=1;i< ca.length;i++){
                capitializedWord = capitializedWord+ca[i];
            }
            finalStatement = finalStatement + capitializedWord + " ";
        }
        System.out.println(finalStatement);
    }
}
