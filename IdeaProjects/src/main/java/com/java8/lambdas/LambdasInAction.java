package com.java8.lambdas;

public class LambdasInAction {
    public static void main(String[] args) {
        Runnable rq = () -> System.out.println("I am runnable");


        processing(() -> System.out.println("I am Running"));
    }
    public static void processing(Runnable r){
        r.run();
    }


//    inventory.sort(comparing(Apple::getWeight));
//    inventory.sort((Apple a1.Apple a2) -> a1.getWeight().compareTo(a2.getWeight()) );
    public interface ApplePredicate{
        public Boolean identifyApple();
    }
//    public class AppleColourPredicate implements ApplePredicate{
//        public Boolean indetifyApple() -> {return Apple.getColour();}
//    }




}
