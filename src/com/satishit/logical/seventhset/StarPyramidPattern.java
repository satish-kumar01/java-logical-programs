package com.satishit.logical.seventhset;

public class StarPyramidPattern {
    public static void main(String[] args) {
        // print no of rows
        for (int i=0;i<5;i++){
            // print no of spaces
            for (int j=0;j<5-i;j++){
                System.out.print(" ");
            }
            // print stars
            for (int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
