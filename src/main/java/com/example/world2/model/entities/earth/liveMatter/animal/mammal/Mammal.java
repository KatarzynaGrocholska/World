package com.example.world2.model.entities.earth.liveMatter.animal.mammal;

import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.entities.earth.liveMatter.animal.Animal;

public abstract class Mammal extends Animal {


    public Mammal(String name, double lifetimeInDays, GeolocationPosition currentPosition) {
        super(name, lifetimeInDays, currentPosition);
    }

}
