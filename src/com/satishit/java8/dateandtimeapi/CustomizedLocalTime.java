package com.satishit.java8.dateandtimeapi;

import java.time.LocalTime;

public class CustomizedLocalTime {
    public static void main(String[] args) {
        //current system time, time:  getHour() + getMinute() + getSecond() + getNano()
        LocalTime time = LocalTime.now();
        //System.out.println(time);
        // h:m:s:n
        int h = time.getHour();
        int m = time.getMinute();
        int s = time.getSecond();
        int n = time.getNano();
        System.out.printf("%d:%d:%d:%d",h,m,s,n);

    }
}
