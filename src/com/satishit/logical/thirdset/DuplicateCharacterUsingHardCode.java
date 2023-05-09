package com.satishit.logical.thirdset;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterUsingHardCode {
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
