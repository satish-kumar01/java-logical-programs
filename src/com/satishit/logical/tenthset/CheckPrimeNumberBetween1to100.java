package com.satishit.logical.tenthset;

public class CheckPrimeNumberBetween1to100 {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            boolean isPrime = true;
            if (i>1){
                for (int j=2;j<i;j++){
                    if (i%j==0){
                        isPrime = false;
                    }
                }
            }else {
               isPrime = false;
            }
            if (isPrime)
            System.out.print(i+" ");
        }
    }
}
