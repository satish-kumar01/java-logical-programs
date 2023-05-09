package com.satishit.java8.consumer.movie;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MovieMain {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();
        populate(list);
        //System.out.println(list);
        Consumer<Movie> c = s -> {
            System.out.println("Movie name: "+s.name);
            System.out.println("Movie hero: "+s.hero);
            System.out.println("Movie heroine "+s.heroine);
            System.out.println();
        };
        for (Movie m : list) {
            c.accept(m);
        }
    }
    public static void populate(List<Movie> list){
        list.add(new Movie("Bahubali","Prabhash","Anushka"));
        list.add(new Movie("Ramsetu","Akshay","Katreena"));
        list.add(new Movie("Dangal","Amir khan","Alia bhaat"));
        list.add(new Movie("Kseriya","Ranbir Kapoor","Alia bhaat"));
    }
}
