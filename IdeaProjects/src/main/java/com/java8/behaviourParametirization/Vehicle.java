package com.java8.behaviourParametirization;

public class Vehicle {
    int maxSpeed = 0;
    String name = "";
    String Model = "";

    public Vehicle(int maxSpeed, String name, String model) {
        this.maxSpeed = maxSpeed;
        this.name = name;
        Model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return Model;
    }


    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        Model = model;
    }


    public String toString(){
        return this.name;
    }
}
