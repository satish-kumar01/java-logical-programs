package com.satishit.logical.eleventhset;

public class RightRotateStringPositionBy3 {
    public static void main(String[] args) {
        String str = "satish";
        char[] ca = str.toCharArray(); // 's','a','t','i','s','h'
        int size = ca.length;
        //n is for checking the no of position
        int n = 3;

        for (int j=1;j<=n;j++){
            char last = ca[size-1];
            //Logic for right rotating by 1 positions
            for (int i=size-1;i>0;i--){
                ca[i] = ca[i-1];
            }
            ca[0] = last;
        }
        StringBuffer sb = new StringBuffer();
        //for-each
        for (char c : ca) {
            sb.append(c);
        }
        System.out.println(sb);
    }
}
