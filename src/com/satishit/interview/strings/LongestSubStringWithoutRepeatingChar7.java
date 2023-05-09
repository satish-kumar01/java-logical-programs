package com.satishit.interview.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatingChar7 {
    public static void main(String[] args) {
        lengthOfLongestSubString("abbac");
    }
    public static void lengthOfLongestSubString(String s){
        String longestSubstring = null;
        int longestSubstringLength = 0;

        Map<Character,Integer> map = new LinkedHashMap<>();
        char[] arr = s.toCharArray();

        for (int i=0;i<arr.length;i++){
            char ch = arr[i];

            if (!map.containsKey(ch)){
                map.put(ch, i);
            }else {
                i = map.get(ch);
                map.clear();
            }
            if (map.size() > longestSubstringLength){
                longestSubstringLength = map.size();
                longestSubstring = map.keySet().toString();
            }
        }
        System.out.println("The longest substring : " + longestSubstring);
        System.out.println("The longest substring length: " + longestSubstringLength);
    }
}
