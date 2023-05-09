package com.satishit.interview.youtube;

/*Convert First half of the String in LowerCase and Second half in UpperCase.
        Input: "This is Java Program This is Java Program"
        Output: this is java program THIS IS JAVA PROGRAM                                                       */
public class StringLowerAndUpperCase {
    public static void main(String[] args) {
        String str = "This is Java Program This is Java Program";
        int mid = str.length()/2;
        String lowerCase = "";
        String upperCase = "";

        for (int i=0;i<str.length();i++){
            if (i<mid){
                lowerCase = lowerCase + Character.toLowerCase(str.charAt(i));
            }else {
                upperCase = upperCase + Character.toUpperCase(str.charAt(i));
            }
        }
        System.out.println(lowerCase+upperCase);
    }
}
