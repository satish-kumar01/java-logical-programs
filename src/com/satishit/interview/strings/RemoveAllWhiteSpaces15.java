package com.satishit.interview.strings;

/*16)Write a java program to remove all white spaces from given String.
        input: ja  va  st  a  r
        output: javastar*/
public class RemoveAllWhiteSpaces15 {
    public static void main(String[] args) {
        String input = "j  a  va  s  ta  r  ";
        /*String trimmedStr = input.trim();
        System.out.println(trimmedStr);*/

        String str = input.replaceAll("\\s", "");
        System.out.println(str);

    }
}
