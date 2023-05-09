package com.satishit.logical.fourteenthset;

public class KShapedAlphabetPattern {
    public static void main(String[] args) {
        int letter = 65;
        //1st part
        for (int i=5;i>0;i--){
            //print alphabets
            for (int j=0;j<i;j++){
                System.out.print((char) (letter+j)+" ");
            }
            System.out.println();
        }
        //2nd part
        for (int i=0;i<5;i++){
            //Alphabets
            for (int j=0;j<=i;j++){
                System.out.print((char) (letter+j)+" ");
            }
            System.out.println();
        }
    }
}
