package com.example.world2.model.entities.earth.liveMatter;

import com.example.world2.model.entities.earth.Earth;
import com.example.world2.model.entities.earth.GeolocationPosition;

public abstract class Plant extends LiveMatter {
    public Plant(String name, double maxLifetimeInSeconds, GeolocationPosition currentPosition, Earth earth,
                 double weightInGrams,
                 double ageInSeconds, double widthInMillimeters, double heightInMillimeters) {
        super(name, maxLifetimeInSeconds, currentPosition, earth, weightInGrams, ageInSeconds,
                widthInMillimeters, heightInMillimeters);
    }
}
