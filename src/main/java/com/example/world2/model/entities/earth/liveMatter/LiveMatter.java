package com.example.world2.model.entities.earth.liveMatter;

import com.example.world2.model.entities.earth.GeolocationPosition;

public abstract class LiveMatter {

    public String getName() {
        return name;
    }

    public double getLifetimeInDays() {
        return lifetimeInDays;
    }

    public GeolocationPosition getCurrentPosition() {
        return currentPosition;
    }

    private String name;
    private double lifetimeInDays;
    private GeolocationPosition currentPosition;

    public LiveMatter(String name, double lifetimeInDays, GeolocationPosition currentPosition) {
        this.name = name;
        this.lifetimeInDays = lifetimeInDays;
        this.currentPosition = currentPosition;
    }
}
