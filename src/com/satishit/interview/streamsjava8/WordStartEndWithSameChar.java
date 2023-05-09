package com.satishit.interview.streamsjava8;

import java.util.Arrays;
import java.util.List;

/*Find all the words that starts and end with same character using Java8.
        Input: "abc","mnm","xlx","xyz","fkf","qwe"
        Output: xlx,fkf,mnm*/
public class WordStartEndWithSameChar {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc","mnm","xlx","xyz","fkf","qwe");
        list.stream().filter(x->x.length()>0 && x.endsWith(String.valueOf(x.charAt(0))))
                .forEach(System.out::println);
    }

}
