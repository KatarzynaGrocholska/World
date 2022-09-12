package com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner.felid;

import com.example.world2.model.entities.earth.Earth;
import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner.felid.Felid;

public class Lion extends Felid {


    public Lion(String name, double lifetimeInDays, GeolocationPosition currentPosition, Earth earth, double weight, double age, double size, boolean warmBlooded) {
        super(name, lifetimeInDays, currentPosition, earth, weight, age, size, warmBlooded);
    }

    @Override
    public void move(GeolocationPosition newGeolocationPosition) {

    }

    @Override
    public void swim() {

    }
}
