package com.satishit.interview.strings;

import java.util.Arrays;
/*Q9)Write a java program To Sort String Characters In Alphabetical Order.
        String str = "rock";
        we can sort this String in 2-Ways
        ---------------------------------
        1) without using sort method
        2) using sort method*/
public class SortAlphabeticalOrder8 {
    public static void main(String[] args) {
        //Approach-1: (Without using sort method)
        String str1 = "satish";
        char[] arr = str1.toCharArray();
        char temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                //Comparision purpose
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(new String(arr));

        //Approach-2: (using sort method)
       /* String str2 = "java";
        char[] charArray = str2.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));*/

    }
}
