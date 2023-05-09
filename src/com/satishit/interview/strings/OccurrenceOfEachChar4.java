package com.satishit.interview.strings;

import java.util.HashMap;
import java.util.Map;

/*Q4)Write a Java Program to Find Occurrence of each Character in Given String.
       Input: hello
       Output: h-1
               e-1
               l-2
               o-1
*/
public class OccurrenceOfEachChar4 {
    public static void main(String[] args){
        String input = "onetwothreefouronetwocatcat";
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = input.toCharArray();
        for(char ch : chars){
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }
            else{
                int value = map.get(ch);
                map.put(ch, value+1);
            }
        }//End Of For loop
        System.out.println(map);
    }
}
