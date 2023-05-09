package com.satishit.java8.constructorreferences;

public class Test {
    public static void main(String[] args) {

        /*Interf f = s -> new Sample(s);
        f.get("From Lambda Expression");
        };*/

        // get() method internally refers Sample class constructor.
        Interf f = Sample::new;
        Sample s = f.get("From Constructor Reference");
    }
}

