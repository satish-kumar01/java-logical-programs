package com.satishit.logical.fourteenthset;

public class DiamondBorderAlphabetPattern {
    public static void main(String[] args) {
        int letter = 65;
        //1st part
        for (int i=0;i<5;i++){
            //print spaces
            for (int k=1;k<5-i;k++){
                System.out.print(" ");
            }
            //print alphabets
            for (int j=0;j<=i;j++){
                if (j==0 || j==i) {
                    System.out.print((char) (letter + i) + " ");
                }else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
        //2nd part
        for (int i=3;i>=0;i--){
            //print spaces
            for (int k=3-i;k>=0;k--){
                System.out.print(" ");
            }
            //print alphabets
            for (int j=0;j<=i;j++){
                if (j==0 || j==i){
                    System.out.print((char) (letter+i)+" ");
                }else {
                    System.out.print(" "+" ");
                }

            }
            System.out.println();
        }
    }
}
