package com.satishit.java8.dateandtimeapi;

import java.time.LocalDate;
import java.time.LocalTime;

//program for to display System Date and time.
public class CurrentDateAndTime {
    public static void main(String[] args) {
        //To represent Current Date, now() -> factory method
        LocalDate date = LocalDate.now();
        System.out.println(date); //2023-02-27
        //To represent Current Time, now() -> factory method
        LocalTime time = LocalTime.now();
        System.out.println(time); //22:27:19.834481300

    }
}
