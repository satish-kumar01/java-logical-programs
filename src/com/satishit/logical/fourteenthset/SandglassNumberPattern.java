package com.satishit.logical.fourteenthset;

public class SandglassNumberPattern {
    public static void main(String[] args) {
        //Print rows 1st part pattern
        for (int i=1;i<=5;i++){
            //Printing the spaces
            for (int j=1;j<i;j++){
                System.out.print(" ");
            }
            //Printing numbers
            for (int k=i;k<=5;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        //Print rows 2nd part pattern
        for (int i=4;i>=1;i--){
            //Printing the spaces
            for (int j=1;j<i;j++){
                System.out.print(" ");
            }
            //printing the numbers
            for (int k=i;k<=5;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
