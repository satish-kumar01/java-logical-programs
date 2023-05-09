package com.satishit.interview.streamsjava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Write a java program to find name in list which started with 'R' Character Using Java8.
        Input: ["Sai","Ram","Kumar","Raju"]
        Output: ["Ram",Raju]*/
public class NameStartWithR {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Sai","Ram","Kumar","Raju");
        list.stream().filter(name-> name.startsWith("R")).forEach(System.out::println);
    }

}
