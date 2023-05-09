package com.satishit.interview.arrays;

/*Q9) Write a Java Program To Find All Pairs Of Elements in an array Whose Sum is Equal To A Given Number.
        Note:-In This case there are three(3) Approach are there.
        --------------------------------------------------------
        1) By Using BRUTE FORCE Method
        2) By Using Sorting an Array
                => Sum is equal to target -> i++, j--
                => Sum is less than target -> i++
                => Sum is greater than target -> j--
        3) By Using HashSet  */

public class ArrayPairs1 {
    // 1) By Using BRUTE FORCE Method
    public static void main(String[] args) {
        int[] arr = {4,6,5,-10,8,2,5};
        int targetNo = 10;
        findThePairs(arr, targetNo);
    }
    public static void findThePairs(int[] arr, int targetNo){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i] + arr[j] == targetNo){
                    System.out.println(arr[i]+" + "+arr[j]+" = "+targetNo);
                }
            }
        }
    }
}
