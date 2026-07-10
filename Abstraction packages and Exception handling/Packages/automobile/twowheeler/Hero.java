package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle {

    private String modelName;
    private String registrationNumber;
    private String ownerName;
    private int speed;

    public Hero(String modelName, String registrationNumber, String ownerName, int speed) {
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.speed = speed;
    }

    public String getModelName() {
        return modelName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getSpeed() {
        return speed;
    }

    public void radio() {
        System.out.println("Radio is working");
    }
}