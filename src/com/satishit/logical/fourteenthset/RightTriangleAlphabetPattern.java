package com.satishit.logical.fourteenthset;

public class RightTriangleAlphabetPattern {
    public static void main(String[] args) {
        int letter = 65;
        //Print rows
        for (int i=0;i<5;i++){
            //print alphabets
            for (int j=0;j<=i;j++){
                System.out.print((char) (letter+j)+" ");
            }
            System.out.println();
        }
    }
}
