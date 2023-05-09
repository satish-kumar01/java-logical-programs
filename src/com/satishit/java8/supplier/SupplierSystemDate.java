package com.satishit.java8.supplier;

import java.util.Date;
import java.util.function.Supplier;

//Write a supplier to supply System Date.
public class SupplierSystemDate {
    public static void main(String[] args) {
        Supplier<Date> s = () -> new Date();
        System.out.println(s.get());
        //System.out.println(s.get());
        //System.out.println(s.get());
    }
}
