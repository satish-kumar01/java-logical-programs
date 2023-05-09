package com.satishit.interview.streamsjava8;

import java.util.Arrays;

/*Find the Sum of all Elements in an Array Using Java8.
        Input: {2,3,4,5,7}
        Output:*/
public class SumOfArrayUsingStream {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,7};
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);

    }
}
