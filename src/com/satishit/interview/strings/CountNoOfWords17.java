package com.satishit.interview.strings;

/*Q10)Write a Java Program to Count Number Of Words in a String.
        Input:-  I am working in dural
        Output:- 5
        -> There Are two Appraoch to Solve this problem
           --------------------------------------------
        1) Convert a string into an array of words and count the no of words in an array.
        2) Traverse a string*/

public class CountNoOfWords17 {
    /*public static void main(String[] args){
        String input = "I  am  working  in  dural  technologies";
        System.out.println(input.split("\\s+").length);
    }*/

    public static void main(String[] args){
        String input = "I am working in dural";
        System.out.println(countWord(input));
    }
    private static int countWord(String str){
        int wordCount = 1;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == ' ' &&
                    i < str.length()-1 && str.charAt(i + 1) != ' '){
                wordCount++;
            }
        }
        return wordCount;
    }


}
