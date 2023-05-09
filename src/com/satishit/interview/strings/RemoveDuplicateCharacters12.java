package com.satishit.interview.strings;

import java.util.LinkedHashSet;
import java.util.Set;

/*Q6)Write a java program to Remove Duplicate characters in Given String.
        Input: programming
        Output: progamin
        4-Approaches with Example
        -------------------------
        1) Using java8
        2) Using indexOf(..)
        3) Using Character Array
        4) Using Set interface method*/
public class RemoveDuplicateCharacters12 {
    public static void main(String[] args) {
        String str = "programming"; //Output= progamin
        //Approach-1 : Using java8
        StringBuilder sb1 = new StringBuilder();
        str.chars().distinct().forEach(c->sb1.append((char)c));
        System.out.println(sb1);

        //Approach-2 : Using indexOf(..)
        StringBuilder sb2 = new StringBuilder();
        for (int i=0;i<str.length();i++){
            //Traverse the string character from starting index position to end index position
            char ch = str.charAt(i);
            int idx = str.indexOf(ch, i + 1);
            if(idx==-1){
                sb2.append(ch);
            }
        }
        System.out.println(sb2);

        //Approach-3 : Using Character Array
        char[] arr = str.toCharArray();
        StringBuilder sb3 = new StringBuilder();
        for (int i=0;i<arr.length;i++){
            boolean repeated = false;
            for (int j=i+1;j<arr.length;j++){
                if (arr[i] == arr[j]){
                    repeated = true;
                    break;
                }
            }
            if (!repeated){
                sb3.append(arr[i]);
            }
        }
        System.out.println(sb3);

        //Approach-4 : Using Set interface method
        StringBuilder sb4 = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();
        //Traverse the String based on index
        for (int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        for (Character c :  set) {
            sb4.append(c);
        }
        System.out.println(sb4);
    }

}
