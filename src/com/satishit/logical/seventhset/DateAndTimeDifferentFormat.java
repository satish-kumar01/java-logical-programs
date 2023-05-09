package com.satishit.logical.seventhset;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTimeDifferentFormat {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        Date date = new Date();
        String formattedDate = sdf.format(date);
        System.out.println(formattedDate);

    }
}
