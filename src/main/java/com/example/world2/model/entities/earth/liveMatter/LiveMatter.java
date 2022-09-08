package com.example.world2.model.entities.earth.liveMatter;

import com.example.world2.model.entities.earth.Earth;
import com.example.world2.model.entities.earth.GeolocationPosition;

public abstract class LiveMatter {

    private String name;
    private double lifetimeInDays;
    private GeolocationPosition currentPosition;
    private Earth earth;
    private double weight;
    private double age;
    private double size;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLifetimeInDays() {
        return lifetimeInDays;
    }

    public void setLifetimeInDays(double lifetimeInDays) {
        this.lifetimeInDays = lifetimeInDays;
    }

    public GeolocationPosition getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(GeolocationPosition currentPosition) {
        this.currentPosition = currentPosition;
    }

    public Earth getEarth() {
        return earth;
    }

    public void setEarth(Earth earth) {
        this.earth = earth;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public LiveMatter(String name, double lifetimeInDays, GeolocationPosition currentPosition,
                      Earth earth, double weight, double age, double size) {
        this.name = name;
        this.lifetimeInDays = lifetimeInDays;
        this.currentPosition = currentPosition;
        this.earth = earth;
        this.weight = weight;
        this.age = age;
        this.size = size;
    }



}
