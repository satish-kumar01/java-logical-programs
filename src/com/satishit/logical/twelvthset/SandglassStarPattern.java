package com.satishit.logical.twelvthset;

public class SandglassStarPattern {
    public static void main(String[] args) {
        //1st part
        for (int i=5;i>0;i--){
            //spaces
            for (int j=5-i;j>=1;j--){
                System.out.print(" ");
            }
            //star
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //2nd part
        for (int i=1;i<=5;i++){
            //spaces
            for (int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            //stars
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
