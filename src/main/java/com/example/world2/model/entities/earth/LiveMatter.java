package com.example.world2.model.entities.earth;

public abstract class LiveMatter {

    private String name;
    private double lifetimeInDays;
    private GeolocationPosition currentPosition;

    public LiveMatter(String name, double lifetimeInDays, GeolocationPosition currentPosition) {
        this.name = name;
        this.lifetimeInDays = lifetimeInDays;
        this.currentPosition = currentPosition;
    }
}
