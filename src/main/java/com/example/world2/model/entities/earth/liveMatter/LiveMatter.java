package com.example.world2.model.entities.earth.liveMatter;

import com.example.world2.model.entities.earth.Earth;
import com.example.world2.model.entities.earth.GeolocationPosition;

public abstract class LiveMatter {

    private String name;
    private double lifetimeInSeconds;
    private GeolocationPosition currentPosition;
    private Earth earth;
    private double weightInGrams;
    private double ageInSeconds;
    private double sizeInMillimeters;

    public LiveMatter(String name, double lifetimeInSeconds, GeolocationPosition currentPosition,
                      Earth earth, double weightInGrams, double ageInMonths, double sizeInMillimeters) {
        this.name = name;
        this.lifetimeInSeconds = lifetimeInSeconds;
        this.currentPosition = currentPosition;
        this.earth = earth;
        this.weightInGrams = weightInGrams;
        this.ageInSeconds = ageInMonths;
        this.sizeInMillimeters = sizeInMillimeters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLifetimeInSeconds() {
        return lifetimeInSeconds;
    }

    public void setLifetimeInSeconds(double lifetimeInSeconds) {
        this.lifetimeInSeconds = lifetimeInSeconds;
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

    public double getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(double weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public double getAgeInMonths() {
        return ageInSeconds;
    }

    public void setAgeInMonths(double ageInMonths) {
        this.ageInSeconds = ageInMonths;
    }

    public double getSizeInMillimeters() {
        return sizeInMillimeters;
    }

    public void setSizeInMillimeters(double sizeInMillimeters) {
        this.sizeInMillimeters = sizeInMillimeters;
    }





}
