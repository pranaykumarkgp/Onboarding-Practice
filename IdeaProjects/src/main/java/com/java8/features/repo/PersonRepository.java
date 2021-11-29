package com.java8.features.repo;

import java.util.Arrays;
import java.util.List;

public class PersonRepository {

    public static List<Person> getAllPerson(){
        Person p1 = new Person(182,"pranay","male",5000,0, Arrays.asList("Singing","painting","playing cricket"));
        Person p2 = new Person(145,"josh","male",5500,1, Arrays.asList("drawing","gym","fishing"));
        Person p3 = new Person(163,"skirta","female",2500,3, Arrays.asList("basketball","painting","eating"));
        Person p4 = new Person(105,"prithvi","male",7000,0, Arrays.asList("making music","riding","coding"));
        Person p5 = new Person(130,"bebo","female",15000,2, Arrays.asList("travelling","painting","trekking"));

        return Arrays.asList(p1,p2,p3,p4,p5);
    }

    public static Person getPerson(){
        return new Person(145,"mahed","male",5900,5,Arrays.asList("skipping","jogging","iterating"));
    }


}
