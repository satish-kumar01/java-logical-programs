package com.satishit.interview.strings;

import java.util.Arrays;

/*Q5)Write a Java Program to Check Weather two Strings are Anagram or Not.
        Ex:- keep & peek = yes
        listen & silent = yes
        sound & wound = No

        Approach:-1) Sorting Technique
        Approach:-2) Compare Character of One String to Character of Another String.

        -> An anagram of a string is another string that contains the same characters,
        only the order of characters can be different.
        For example:- “abcd” and “dabc” are an Anagram of each other.*/
public class CheckAnagramSortingTechnique10 {
    public static void main(String[] args){
        String s1 = "peek";
        String s2 = "keep";
        System.out.println(checkAnagrams(s1,s2));

    }
    private static boolean checkAnagrams(String s1,String s2){
        boolean flag = true;

        //Write the logic two Strings are Angram or not
        if(s1.length() != s2.length()){
            return false;
        }

        //Convert Two Strings into Character Array
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        //Write the logic For sort functionality
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }

}
