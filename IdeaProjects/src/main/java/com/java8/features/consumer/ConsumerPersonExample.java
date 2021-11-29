package com.java8.features.consumer;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerPersonExample {

    static Consumer<Person> c1 = (p) -> {System.out.println(p);};
    static Consumer<Person> c2 = (p) -> {System.out.println(p.getName().toUpperCase());};
    static Consumer<Person> c3 = (p) -> {System.out.println(p.getHobbies());};
    public static void main(String[] args) {
        //List<Person> personList = PersonRepository.getAllPerson();
        c1.accept(PersonRepository.getPerson());
    }
}
