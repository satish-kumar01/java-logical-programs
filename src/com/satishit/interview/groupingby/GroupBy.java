package com.satishit.interview.groupingby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupBy {
    public static void main(String[] args) {
        List<String> keywords = Arrays.asList("Apple","Mango","Banana","Cherry","Banana");

        Map<String,List<String >> groupByWordMap =
                keywords.stream().collect(Collectors.groupingBy(words->words));
        System.out.println(groupByWordMap);

        Map<String,Long> result =
                keywords.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result);
    }
}
