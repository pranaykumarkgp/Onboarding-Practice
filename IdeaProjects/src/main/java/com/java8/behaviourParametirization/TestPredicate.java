package com.java8.behaviourParametirization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class TestPredicate {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = Arrays.asList(new Vehicle(120,"Porche","Hatchback"),new Vehicle(150,"Mercedes","Sedan"),
        new Vehicle(220,"RangeRover","SUV"),new Vehicle(80,"Maruti","Hatchback"),new Vehicle(350,"Porche","Sedan"),
        new Vehicle(130,"Maruti","Sedan"),new Vehicle(250,"Mahindra","SUV"));


//        System.out.println(filteredVehicles(vehicleList,new filterSpeedPredicate()));
        System.out.println(filteredVehicles(vehicleList,a -> a.getMaxSpeed() > 150));
        System.out.println(filteredVehicles(vehicleList,a -> "Hatchback".equals(a.getModel())));

        vehicleList.sort(new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle o1, Vehicle o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println(vehicleList);

        //More precise way to do the same
        vehicleList.sort((a,b) -> a.getName().compareTo(b.getName()));


    }

    public interface Predicate<T>{
        public Boolean test(T t);
    }
    interface vehiclePredicate{
        public Boolean test(Vehicle a);
    }

    static class filterSpeedPredicate implements vehiclePredicate{
        public Boolean test(Vehicle a){return a.getMaxSpeed() > 150;}
    }

    static class filterModelPredicate implements vehiclePredicate{
        public Boolean test(Vehicle v){return "Hatchback".equals(v.getModel());}
    }


    //Adding a type Parameter T
    //To make the method filteredVehicles more generalised
    public static<T> List<T> filteredVehicles(List<T> typeT, Predicate<T> v){
        List<T> temp = new ArrayList<T>();
        for (T a:typeT) {
            if(v.test(a)){
                temp.add(a);
            }
        }
        return temp;
    }

//    static class filterModelPredicate implements vehiclePredicate{}
//    public Boolean test(Vehicle v){return "Sedan".equals(v.getModel());}
}
