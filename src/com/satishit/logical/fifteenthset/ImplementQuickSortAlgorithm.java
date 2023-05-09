package com.satishit.logical.fifteenthset;

import java.util.Arrays;

public class ImplementQuickSortAlgorithm {
    public static void main(String[] args) {
        int[] ar = {50,25,119,41,62,21,65,84,33,21};
        ImplementQuickSortAlgorithm iqsa = new ImplementQuickSortAlgorithm();
        iqsa.sort(ar,0,ar.length-1);
        System.out.println(Arrays.toString(ar));

    }
    public void sort(int[] ar,int lowerBound,int upperBound){
        if (lowerBound<upperBound){
            int location = partition(ar, lowerBound, upperBound);
            sort(ar,lowerBound,location-1);
            sort(ar,location+1,upperBound);
        }

    }

    public int partition(int[] ar,int lowerBound,int upperBound) {
        int pivot = ar[lowerBound];
        int start = lowerBound;
        int end = upperBound;

        while (start < end) {
            while (ar[start] <= pivot) {
                start++;
            }
            while (ar[end] > pivot) {
                end--;
            }
            if (start < end) {
                swap(ar, start, end);
            }
        }
        swap(ar,lowerBound,end);
        return end;
    }

        public void swap ( int[] ar, int s, int e){
            int temp;
            temp = ar[s];
            ar[s] = ar[e];
            ar[e] = temp;

        }

}
