package com.satishit.interview.youtube;

/*Display Last 2-Digit in Mobile Number And Replace Remaining Digits with '#'.
        Input: 6204666298
        Output: ########98   */
public class ReplaceHashOfMobileNo {
    public static void main(String[] args) {
        String phoneNumber = "6204666298";
        String regx = phoneNumber.replaceAll(".(?=.{2})","#");
        System.out.println(regx);
    }
}
