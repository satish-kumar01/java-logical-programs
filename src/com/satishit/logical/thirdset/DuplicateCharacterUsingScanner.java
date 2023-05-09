package com.satishit.logical.thirdset;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharacterUsingScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any english statement:");
        String str = sc.nextLine();

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] ch = str.toCharArray();

        // For each loop
        for (Character c : ch){
            if (map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else {
                map.put(c, 1);
            }
        }
        for (Character c : map.keySet()){
            if (map.get(c)>1){
                System.out.println("Character "+c+" is repeated "+map.get(c)+" times");
            }
        }
    }
}
