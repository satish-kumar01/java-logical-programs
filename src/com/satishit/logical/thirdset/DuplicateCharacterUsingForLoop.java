package com.satishit.logical.thirdset;

public class DuplicateCharacterUsingForLoop {

    public static int characterOccurrence(String input, char ch) {

        int chCount = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ch) {
                chCount++;
            }
        }
        return chCount;

    }

    public static void main(String[] args) {
        char findChar = 's';
        int chCount = characterOccurrence("satishsatish", findChar);
        System.out.println("The character '" + findChar + "' in the string is '" + chCount + "' times");

    }
    /*public static void main(String[] args) {
        String str1 = "Satish Kumar";
        int beforeLength = str1.length();
        String str2 = str1.replace("a", "");
        int afterLength = str2.length();
        System.out.println("The number of times a has occured in the given string text is: "+
                (beforeLength-afterLength));
    }*/

    /*public static void main(String[] args) {
        String str1 = "Satish Kumar";
        char[] ca = str1.toCharArray();
        int count = 0;
        for (int i =0;i<ca.length;i++){
            if ('a'==ca[i]){
                count++;
            }
        }
        System.out.println("The number of occurances of the character a in the given string text is: "+count);
    }*/


}
