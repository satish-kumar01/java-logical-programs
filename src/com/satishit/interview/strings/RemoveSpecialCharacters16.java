package com.satishit.interview.strings;

/*15)Write a java program to remove all special character from a given string
        input: $ja!va$@st%ar
        output: javastar*/
public class RemoveSpecialCharacters16 {
    public static void main(String[] args) {
        //"\"Progr#am%m*in&g Lan?#guag(e\"";
        //"$ja!va$&st%ar";
        String input = "$ja!va$&st%ar";
        //Approach-1 (replaceAll() method
        String plainStr = input.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(plainStr);
    }
}
