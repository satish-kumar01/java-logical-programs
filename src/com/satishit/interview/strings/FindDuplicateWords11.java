package com.satishit.interview.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateWords11 {

    public static void main(String[] args){
        findDuplicateWords("How Are You How Are You");
    }
    public static void findDuplicateWords(String inputString){

        //Split
        String words[] = inputString.split(" ");
        //Create One HashMap
        Map<String, Integer> hm = new HashMap<String, Integer>();
        //to check each word in given array (wordCount)
        for(String word : words){
            //If word is present
            if(hm.containsKey(word)){
                hm.put(word.toLowerCase(), hm.get(word)+1);
            }
            else{
                hm.put(word, 1);
            }
        }//End of For loop
        //Extracting all the keys of map - wordCount
        Set<String> wordsInString = hm.keySet();

        //Loop through all the words in wordcount
        for(String word : wordsInString){
            if(hm.get(word)>1){
                System.out.println(word + " : "+hm.get(word));
            }
        }
    }
}
