package com.satishit.logical.eleventhset;

public class LeftTriangleStarPattern {
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            //print spaces
            for (int j=1;j<2*(5-i);j++){
                System.out.print(" ");
            }
            //print stars
            for (int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
