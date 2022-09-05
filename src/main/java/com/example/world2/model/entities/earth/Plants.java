package com.example.world2.model.entities.earth;

public abstract class Plants extends LiveMatter {
    public Plants(String name, double lifetimeInDays, GeolocationPosition currentPosition) {
        super(name, lifetimeInDays, currentPosition);
    }
}
