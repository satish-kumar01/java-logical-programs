package com.satishit.interview.strings;

import java.util.HashSet;
import java.util.Set;

/*Q6)Write a java Program to Find Duplicate Words in the Given String.
        Input:  "one two three one two"
        Output:  one two*/
public class DuplicateWords11 {
    public static void main(String[] args){

        Set<String> dups = new HashSet<>();
        Set<String> set  = new HashSet<>();
        String input = "one two three  one two";
        //Split method
        String[] words = input.split(" ");
        //To Check Each Word in Given Array
        for(String word : words){
            boolean isAdded = set.add(word);
            //If word is not present
            if(!isAdded){
                dups.add(word);
            }
        }//End Of For loop
        System.out.println(dups);

    }
}
