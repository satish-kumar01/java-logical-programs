package com.satishit.java8.dateandtimeapi;

import java.time.LocalDate;

public class CustomizedLocalDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        /*2023-02-27 -> default system date
        27...2...2023
        27-2-2023 -> Customized date*/
        int dd = date.getDayOfMonth();
        int mm = date.getMonthValue();
        int yyyy = date.getYear();
        System.out.println(dd+"..."+mm+"..."+yyyy);
        System.out.printf("%d-%d-%d",dd,mm,yyyy);

    }
}
