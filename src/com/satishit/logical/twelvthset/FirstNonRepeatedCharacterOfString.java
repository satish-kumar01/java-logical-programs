package com.satishit.logical.twelvthset;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatedCharacterOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String text:"); // Amazon
        String str = sc.nextLine().toLowerCase();
        //Iterate each and every character in string text
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        boolean status = false;
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (map.get(ch)==null){
                map.put(ch,1);
            }else {
                map.put(ch, map.get(ch)+1);
            }

        }
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (map.get(ch)==1){
                System.out.println("First non-repeated character in the given string text is: "+ch);
                status = true;
                break;
            }
        }
        if (!status){
            System.out.println("There is no unique character in the given string text.");
        }
    }
}
