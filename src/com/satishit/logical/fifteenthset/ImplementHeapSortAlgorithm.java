package com.satishit.logical.fifteenthset;

import java.util.Arrays;

public class ImplementHeapSortAlgorithm {
    public static void main(String[] args) {
        int[] ar = {16,7,22,3,19,9,33};
        ImplementHeapSortAlgorithm ihsa = new ImplementHeapSortAlgorithm();
        ihsa.sort(ar,ar.length);
        System.out.println(Arrays.toString(ar));
    }
    public void sort(int[] ar, int size){
        for (int i=size/2-1;i>=0;i--){
            heapify(ar,size,i);
        }
        for (int i=size-1;i>=0;i--){
            int temp = ar[0];
            ar[0] = ar[i];
            ar[i] = temp;
            heapify(ar,i,0);
        }
    }

    public void heapify(int[] ar,int size,int i){
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if (left<size && ar[left]>ar[largest]){
            largest = left;
        }
        if (right<size && ar[right]>ar[largest]){
            largest = right;
        }
        if (largest!=i){
            int temp = ar[i];
            ar[i] = ar[largest];
            ar[largest] = temp;

            heapify(ar,size,largest);
        }
    }
}
