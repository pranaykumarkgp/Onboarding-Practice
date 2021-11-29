package com.java8.lambdas;

public class SomeExamplesOfRunnable {
    public static void main(String[] args) {

        //before java 8
        //more clumsy
        //less readable
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("r is running");
            }
        };


        //Now using Lambdas
        Runnable r1 = () -> System.out.println("r1 is running");
        process(r);
        process(r1);

        //Since process takes a parameter of type Runnable, lambdas can be used as parameter
        //with the exact same signatures as the method inside runnable interface.
        //()->{}
        process(() -> System.out.println("inline lambda is running"));
    }


    public static void process(Runnable r){
        r.run();
    }
}
