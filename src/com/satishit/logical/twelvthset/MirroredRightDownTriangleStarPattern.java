package com.satishit.logical.twelvthset;

public class MirroredRightDownTriangleStarPattern {
    public static void main(String[] args) {
        for (int i=5;i>=0;i--){

            //spaces
            for (int j =5;j>i;j--){
                System.out.print(" ");
            }
            //stars
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
