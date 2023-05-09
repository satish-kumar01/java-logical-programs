package com.satishit.logical.eleventhset;

public class ReversedPyramidStarPattern {
    public static void main(String[] args) {
        for (int i=0;i<5;i++){

            //printing the spaces
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            //printing the stars
            for (int k=5-i;k>0;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
