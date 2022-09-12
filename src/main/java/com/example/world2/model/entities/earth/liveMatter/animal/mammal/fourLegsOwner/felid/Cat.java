package com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner.felid;

import com.example.world2.model.entities.earth.Earth;
import com.example.world2.model.entities.earth.GeolocationPosition;

public class Cat extends Felid {


    public Cat(String name, double lifetimeInDays, GeolocationPosition currentPosition, Earth earth, double weight, double age, double size, boolean warmBlooded) {
        super(name, lifetimeInDays, currentPosition, earth, weight, age, size, warmBlooded);
    }

    @Override
    public void swim() {

    }
}
