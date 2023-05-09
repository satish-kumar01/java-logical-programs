package com.satishit.logical.seventhset;

public class NumberDivisibleBy2And3 {
    public static void main(String[] args) {
        for (int i =1;i<=25;i++){
            if (i%2==0 && i%3==0){
                System.out.print(i+" ");
            }
        }
    }
}
