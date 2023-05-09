package com.satishit.interview.streamsjava8;


/*Program to Count Strings Whose Length is greater than 3 in List Using Java8.
        Input: {"Java","php","angular","python","R","C++"}*/

import java.util.Arrays;
import java.util.List;

public class CountStringLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java","php","angular","python","R","C++");
        long count = list.stream().filter(e -> e.length() > 3).count();
        System.out.println(count);
    }

}
