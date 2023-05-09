package com.satishit.interview.streamsjava8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*Count the Number Of Occurrence Of words in Given String Using Java8.
        Input: "Welcome to Satish IT and Satish IT Welcome you"
        Output: {and=1, Satish=2, Welcome=2, IT=2, to=1, you=1} */
public class NoOfOccurrenceJava8 {
    public static void main(String[] args) {
        String str = "Welcome to Satish IT and Satish IT Welcome you";
        List<String> list = Arrays.asList(str.split(" "));

        Map<String,Long> result =
        list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result);

    }

}
