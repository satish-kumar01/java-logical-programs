package com.satishit.interview.strings;

/*Q7)Write a Java Program to Find all Permutation Of String Recursively :
        For Ex:- All Permutations oF String "JSP" are
        JSP
        JPS
        SJP
        SPJ
        PJS
        PSJ*/
public class PermutationOfString13 {

    public static void main(String[] args){
        stringPermutation("ABC");
    }

    public static void stringPermutation(String input){
        System.out.println("Permutation Of String::"+input);
        stringPermutation(" ",input);
    }
    public static void stringPermutation(String permutation, String input){
        if(input.length() == 0){
            System.out.println(permutation);
        }
        else{
            for(int i = 0;i<input.length(); i++){
                stringPermutation(permutation + input.charAt(i),
                        input.substring(0,i)+input.substring(i+1,input.length()));
            }
        }
    }
}
