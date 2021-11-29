package com.java8.features.consumer;

import java.util.function.Consumer;
import com.java8.features.repo.Person;

public class ConsumerExample {
    //has one abstract method named accept, i.e it accepts one parameter
    //has one default method named andThen()
    public static void main(String[] args) {
        Consumer<String> con1 = (s) -> {System.out.println(s.toUpperCase());};
        //con1.accept("java8");
        Consumer<String> con2 = (s) -> System.out.println(s.toLowerCase());
        //con2.accept("java8");

        //con1 will be executed first and then con2,
        // both will use the same accept parameters
        con1.andThen(con2).accept("java8");//con1 will be executed first and then con2,
                                             // both will use the same accept parameters
    }
}
