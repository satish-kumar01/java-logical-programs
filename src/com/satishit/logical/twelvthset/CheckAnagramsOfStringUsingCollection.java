package com.satishit.logical.twelvthset;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckAnagramsOfStringUsingCollection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:"); //BAT
        String str1 = sc.nextLine().toLowerCase().replaceAll("\\s","");
        System.out.println("Enter second string:"); //TAB
        String str2 = sc.nextLine().toLowerCase().replaceAll("\\s","");
        if (isAnagrams(str1, str2)){
            System.out.println("Given first string "+str1+" and second string "+str2+" are Anagrams");
        }else {
            System.out.println("Given first string "+str1+" and second string "+str2+" are not Anagrams");
        }

    }
    //Logic for checking whether two strings text are anagrams or not
    public static boolean isAnagrams(String str1, String str2){
        Map<Character, Integer> map1 = new HashMap<Character,Integer>();
        Map<Character,Integer> map2 = new HashMap<Character,Integer>();
        for (int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            if (map1.get(ch)==null){
                map1.put(ch,1);
            }else {
                map1.put(ch,map1.get(ch)+1);
            }
        }
        for (int i=0;i<str2.length();i++){
            char ch = str2.charAt(i);
            if (map2.get(ch)==null){
                map2.put(ch,1);
            }else {
                map2.put(ch,map2.get(ch)+1);
            }
        }
        return map1.equals(map2);

    }
}
