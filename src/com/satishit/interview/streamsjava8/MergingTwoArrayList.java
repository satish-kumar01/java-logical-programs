package com.satishit.interview.streamsjava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*Merge Two Lists into Single List using Java8.
        Input: List1 [1,2,3,4,5]
               List2 [3,4,5,6,7,8]
        Output: MergeList [1,2,3,4,5,3,4,5,6,7,8]

        Remove Duplicates from MergeList and Print only Unique Elements.
        Input: MergeList [1,2,3,4,5,3,4,5,6,7,8]
        Output: UniqueElements [1,2,3,4,5,6,7,8]*/
public class MergingTwoArrayList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(3,4,5,6,7,8);

        List<Integer> mergeList =
                Stream.concat(list1.stream(),list2.stream()).collect(Collectors.toList());
        System.out.println(mergeList);

        //Remove Duplicates and print unique values
        List<Integer> unique =
                mergeList.stream().distinct().collect(Collectors.toList());
        System.out.println(unique);
    }

}
