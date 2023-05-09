package com.satishit.java8.dateandtimeapi;

import java.time.LocalDateTime;

public class BothDateAndTime {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        //System.out.println(dt); //Date value: 2023-02-27 Time value: 23:12:18.223497800

        /*Date: 27-2-2023
        Time: 23:19:35:961019700*/

        int dd = dt.getDayOfMonth();
        int mm = dt.getMonthValue();
        int yy = dt.getYear();
        System.out.printf("Date: %d-%d-%d",dd,mm,yy);
        int h = dt.getHour();
        int m = dt.getMinute();
        int s = dt.getSecond();
        int n = dt.getNano();
        System.out.printf("\nTime: %d:%d:%d:%d",h,m,s,n);
    }

}
