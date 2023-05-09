package com.satishit.interview.strings;

public class CheckAnagramsCompareTechnique10 {

    public static void main(String[] args){
        String s1 = "keep";
        String s2 = "peek";
        System.out.println(checkAnagrams(s1,s2));

    }
    private static boolean checkAnagrams(String s1,String s2){
        boolean flag = true;
        //Write the logic two Strings are Angram or not
        if(s1.length() != s2.length()){
            return false;
        }
        //nested for loop
        int found = 0;
        for (int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            for (int j=0;j<s2.length();j++){
                if (ch==s2.charAt(j)){
                    found = 1;
                    break;
                }
            }//inner-loop ending
            if (found==0){
                flag=false;
                break;
            }
        } // Outer-loop ending
        return flag;
    }

}
