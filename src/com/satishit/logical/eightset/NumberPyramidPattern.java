package com.satishit.logical.eightset;

public class NumberPyramidPattern {
    public static void main(String[] args) {
        //for loop for Print row
        for (int i=0;i<5;i++){
            //inner for loop to printing the spaces
            for (int j=0;j<5-i;j++){
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
