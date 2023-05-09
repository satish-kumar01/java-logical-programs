package com.satishit.interview.strings;

/*Q3)Write a Java Program to reverse Each Word of a String Without Using Predefined Method.
       Input:  java Code
       Output: avaj edoc
*/
public class ReverseEachWord3 {
    public static void main(String[] args){
        String input = "java code";
        System.out.println("Original String ::"+input);
        String output = "";
        String[] words = input.split(" ");
        for(String word : words){
            String revword = "";
            //reverse word
            for(int i = word.length()-1; i>=0; i--){
                revword = revword + word.charAt(i);
            }
            output = output + revword + "";
        }
        System.out.println("Reversed String ::"+output);
    }
}
