package com.satishit.logical.fifteenthset;

import java.util.Arrays;

public class ImplementMergeSortAlgorithm {
    public static void main(String[] args) {
        int[] ar = {41,62,23,46,2,9,89,25,15,65};
        ImplementMergeSortAlgorithm imsa = new ImplementMergeSortAlgorithm();
        imsa.sort(ar, 0, ar.length-1);
        System.out.println(Arrays.toString(ar));


    }
    public void sort(int[] ar, int begin, int end){
        if (begin<end){
            int middle = (begin+end)/2;
            sort(ar,begin,middle);   // left array
            sort(ar,middle+1,end); //right array
            merge(ar,begin,middle,end);

        }
    }
    public  void merge(int[] ar, int begin,int middle,int end ){
        int leftArraySize = middle-begin+1;
        int rightArraySize = end-middle;
        int[] leftArray = new int[leftArraySize];
        int[] rightArray = new int[rightArraySize];
        for (int i =0;i<leftArraySize;i++){
            leftArray[i] = ar[begin+i];
        }
        for (int j=0;j<rightArraySize;j++){
            rightArray[j] = ar[middle+1+j];
        }
        int i=0;
        int j=0;
        int k=begin;

        while (i<leftArraySize && j<rightArraySize){
            if (leftArray[i] < rightArray[j]){
                ar[k] = leftArray[i];
                i++;
            }else {
                ar[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i<leftArraySize){
            ar[k] = leftArray[i];
            i++;
            k++;
        }
        while (j<rightArraySize){
            ar[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
