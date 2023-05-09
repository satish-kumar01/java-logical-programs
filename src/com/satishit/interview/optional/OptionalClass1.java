package com.satishit.interview.optional;

import java.util.Optional;

public class OptionalClass1 {
    public static void main(String[] args) {
        String str = null; //null //java -> //CE-> NPE
        Optional<String> optional = Optional.ofNullable(str);
        System.out.println("Value is::"+optional.get());
    }
}
