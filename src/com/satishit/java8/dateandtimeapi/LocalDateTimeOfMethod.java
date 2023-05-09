package com.satishit.java8.dateandtimeapi;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeOfMethod {
    public static void main(String[] args) {
        //LocalDateTime dt = LocalDateTime.of(yy,mm,dd,h,m,s,n); of() factory method
        //To Print 1995,May,28, Month.may -> 05
        LocalDateTime dt = LocalDateTime.of(1995, Month.MAY,28,12,45);
        System.out.println(dt); //1995-05-28T12:45
        System.out.println("After six months: "+dt.plusMonths(6));
        System.out.println("Before Six months: "+dt.minusMonths(6));
        /*After six months: 1995-11-28T12:45
        Before Six months: 1994-11-28T12:45
        */

    }
}
