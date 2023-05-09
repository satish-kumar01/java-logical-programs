package com.satishit.java8.consumer.consumerchaining;

import java.util.function.Consumer;

public class MovieMain {
    public static void main(String[] args) {
        Consumer<Movie> c1 = m -> System.out.println("Movie:"+m.name+"is ready to release");
        Consumer<Movie> c2 = m -> System.out.println("Movie:"+m.name+"is just released and it is:"+m.result);
        Consumer<Movie> c3 = m -> System.out.println("Movie:"+m.name+" Information storing in the database");

        Consumer<Movie> chainedC = c1.andThen(c2).andThen(c3);

        Movie m1 = new Movie("Bhaubali","hit");
        chainedC.accept(m1);
        System.out.println();

        Movie m2 = new Movie("Dangal","flop");
        chainedC.accept(m2);
    }
}
