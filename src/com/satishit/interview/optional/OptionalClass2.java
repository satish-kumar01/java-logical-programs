package com.satishit.interview.optional;

import java.util.Optional;

public class OptionalClass2 {
    public static void main(String[] args) {
        String str = null;
        Optional<String> optional = Optional.ofNullable(str);
        if (optional.isPresent()){
            System.out.println("Value is::"+ optional.get());
        }else {
            System.out.println("Value is not present::");
        }
    }
}
