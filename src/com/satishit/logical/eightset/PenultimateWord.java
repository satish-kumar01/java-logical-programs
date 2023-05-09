package com.satishit.logical.eightset;

import java.util.Scanner;

public class PenultimateWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any statement:"); //My name is Satish Kumar.
        String statement = sc.nextLine();
        // Code for finding the penultimate word in the given statement
        String[] words = statement.split(" ");
        if (words.length>1){
            System.out.println("Penultimate of the given sentence is: "+words[words.length-2]);
        }else {
            System.out.println("The given statement has less then 2 words, hence penultimate word cannot be printed:");
        }
    }
}
