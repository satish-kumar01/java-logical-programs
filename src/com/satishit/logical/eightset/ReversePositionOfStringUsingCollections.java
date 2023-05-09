package com.satishit.logical.eightset;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversePositionOfStringUsingCollections {
    public static void main(String[] args) {
        String str = "This is a statement one";
        String[] words = str.split(" ");
        List<String> list = Arrays.asList(words);
        Collections.reverse(list);
        // for-each loop
        for (String word : list){
            System.out.print(word+" ");
        }

    }
}
