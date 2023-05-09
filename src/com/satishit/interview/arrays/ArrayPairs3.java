package com.satishit.interview.arrays;

import java.util.HashSet;

public class ArrayPairs3 {
    // 3) By Using HashSet
    public static void main(String[] args) {
        int[] inputArray = {9,5,14,3,1,15,6};
        int targetNo = 20;

        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer element : inputArray) {
            int exceptedSecondElement = targetNo - element;

            if (hashSet.contains(exceptedSecondElement))
                System.out.println(element+","+exceptedSecondElement);
            else
                hashSet.add(element);
        }
    }
}
