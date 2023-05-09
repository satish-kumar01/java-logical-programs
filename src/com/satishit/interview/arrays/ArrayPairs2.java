package com.satishit.interview.arrays;

import java.util.Arrays;

/*2) By Using Sorting an Array
        => Sum is equal to target -> i++, j--
        => Sum is less than target -> i++
        => Sum is greater than target -> j--*/

public class ArrayPairs2 {
    // 2) By Using Sorting an Array
    public static void main(String[] args) {
        int[] inputArray = {9,5,14,3,1,15,6};
        int targetNo=20;

        Arrays.sort(inputArray);
        int i = 0;
        int j = inputArray.length-1;
        while (i<j){
            if (inputArray[i] + inputArray[j] == 20){
                System.out.println(inputArray[i]+","+inputArray[j]);
                i++;
                j--;
            }
            if (inputArray[i] + inputArray[j] < targetNo)
                i++;
            if (inputArray[i] + inputArray[j] > targetNo)
                j--;
        }

    }
}
