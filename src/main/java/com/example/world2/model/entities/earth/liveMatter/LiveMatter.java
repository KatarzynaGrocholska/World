package com.example.world2.model.entities.earth.liveMatter;

import com.example.world2.model.entities.earth.Earth;
import com.example.world2.model.entities.earth.GeolocationPosition;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class LiveMatter {

    private String name;
    private double maxLifetimeInSeconds;
    private GeolocationPosition currentPosition;
    private Earth earth;
    private double weightInGrams;
    private double ageInSeconds;
    private double widthInMillimeters;
    private double heightInMillimeters;

    public LiveMatter(String name, double maxLifetimeInSeconds, GeolocationPosition currentPosition,
                      Earth earth, double weightInGrams, double ageInSeconds, double widthInMillimeters,
                      double heightInMillimeters) {
        this.name = name;
        this.maxLifetimeInSeconds = maxLifetimeInSeconds;
        this.currentPosition = currentPosition;
        this.earth = earth;
        this.weightInGrams = weightInGrams;
        this.ageInSeconds = ageInSeconds;
        this.widthInMillimeters = widthInMillimeters;
        this.heightInMillimeters = heightInMillimeters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxLifetimeInSeconds() {
        return maxLifetimeInSeconds;
    }

    public void setMaxLifetimeInSeconds(double maxLifetimeInSeconds) {
        this.maxLifetimeInSeconds = maxLifetimeInSeconds;
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
    } //fixme tylko zwiększenie

    public double getWidthInMillimeters() {
        return widthInMillimeters;
    }

    public void setWidthInMillimeters(double widthInMillimeters) {
        this.widthInMillimeters = widthInMillimeters;
    }

    public double getHeightInMillimeters() {
        return heightInMillimeters;
    }

    public void setHeightInMillimeters(double heightInMillimeters) {
        this.heightInMillimeters = heightInMillimeters;
    }

}
