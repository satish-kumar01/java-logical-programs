package com.satishit.logical.tenthset;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacterOfString {
    public static void main(String[] args) {
        String str = "coconut";
        Set<Character> set = new LinkedHashSet<Character>();
        for (int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        StringBuffer sb = new StringBuffer();
        //for-each loop
        for (Character c : set) {
            sb.append(c);
        }
        System.out.println("String text after removing the duplicate character is: "+sb);

    }
}
