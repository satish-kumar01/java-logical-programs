package com.satishit.interview.youtube;

import java.util.Arrays;

/*Write a program to generate the Largest Number Possible Using these Digits.
        Input: ar[] = {8,6,0,4,6,4,2,7}
        Output: Largest Number = 87664420  */
public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {8,6,0,4,6,4,2,7};
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        String result = "";
        for (int i=0;i<arr.length;i++){
            result = result + arr[i];
        }
        System.out.println(result);

    }
}
