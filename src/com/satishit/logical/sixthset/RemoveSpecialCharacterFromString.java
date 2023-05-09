package com.satishit.logical.sixthset;

public class RemoveSpecialCharacterFromString {
    public static void main(String[] args) {
        String str1 = "$131#@% $abcd123 ABCDEF()";
        String str2 = str1.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str2);

    }
}
