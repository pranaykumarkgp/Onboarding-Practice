package com.java8.features.repo;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private int Height;
    private String name;
    private String gender;
    private double salary;
    private int kids;
    List<String> hobbies = new ArrayList<>();


    public Person(int height, String name, String gender, double salary, int kids, List<String> hobbies) {
        Height = height;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.kids = kids;
        this.hobbies = hobbies;
    }

    public int getHeight() {
        return Height;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public int getKids() {
        return kids;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setKids(int kids) {
        this.kids = kids;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

}
