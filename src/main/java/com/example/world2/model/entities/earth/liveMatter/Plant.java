package com.example.world2.model.entities.earth.liveMatter;

import com.example.world2.model.entities.earth.GeolocationPosition;

public abstract class Plant extends LiveMatter {
    public Plant(String name, double lifetimeInDays, GeolocationPosition currentPosition) {
        super(name, lifetimeInDays, currentPosition);
    }


}
