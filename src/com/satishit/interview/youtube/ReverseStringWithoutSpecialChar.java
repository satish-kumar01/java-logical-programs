package com.satishit.interview.youtube;

/*1) Reverse the String without affecting the Special character.
        Input: r#aa$pid
        Output: d#ip$aar  */
public class ReverseStringWithoutSpecialChar {
    public static void main(String[] args) {
        String input  = "r#aa$pid"; //d#ip$aar
        char[] arr = input.toCharArray();
        int i = 0;
        int j = arr.length-1;
        while (i<j){
            //don't reverse when char is special char
            if (!Character.isAlphabetic(arr[i]))i++;
            else if (!Character.isAlphabetic(arr[j]))j--;
            else {
                char ch = arr[i];
                arr[i] = arr[j];
                arr[j] = ch;
                i++;
                j--;
            }
        }
        String str = new String(arr);
        System.out.println(arr);
    }
}
