package com.satishit.logical.sixthset;

public class RemoveSpacesFromString {
    public static void main(String[] args) {
        String str1 = "A  B  C  D";
        //String str2 = str1.replaceAll("\\s", "");
        String str2 = str1.replaceAll(" ", "");
        System.out.println(str2);
    }
}
