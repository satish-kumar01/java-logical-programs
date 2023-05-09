package com.satishit.logical.sixthset;

public class ReverseEachWordOfGivenString {
    public static void main(String[] args) {
        String str = "Mr Satish Kumar";
        String[] words = str.split(" "); //{"Mr","Satish","Kumar" }
        String reversedString = "";
        // for-each
        for (String word : words) {
            String reverseWord = "";
            for (int i=word.length()-1;i>=0;i--){
                reverseWord = reverseWord+word.charAt(i);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        System.out.println(reversedString);
    }
}
