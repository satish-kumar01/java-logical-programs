package com.satishit.interview.streamsjava8;

import java.util.Arrays;

/*Java program to find longest String from given Array using java8.

        String[] arr = {"Java","Hibernate","SpringBoot","Microservices"}*/
public class LongestStringAnArray {
    public static void main(String[] args) {
        String[] strArr = {"Java","Hibernate","SpringBoot","Microservices"};
        String longestString =
                Arrays.stream(strArr)
                        .reduce((word1,word2)->word1.length()>word2.length() ? word1:word2).get();
        System.out.println(longestString);

    }
}
