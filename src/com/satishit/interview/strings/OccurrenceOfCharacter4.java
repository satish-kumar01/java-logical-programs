package com.satishit.interview.strings;

public class OccurrenceOfCharacter4 {

    public static int characterOccurrence(String input, char ch){
        int count = 0;

        for (int i=0;i<input.length();i++){
            if (input.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        char findChar='s';
        int chCount = characterOccurrence("satishsatish", findChar);
        System.out.println("The character "+findChar+" in the string is "+chCount+ " times");

    }
}
