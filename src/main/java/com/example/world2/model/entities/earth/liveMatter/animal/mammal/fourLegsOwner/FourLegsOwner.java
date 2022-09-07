package com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner;

import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.entities.earth.liveMatter.animal.mammal.Mammal;
import com.example.world2.model.interfaces.Walkable;

public abstract class FourLegsOwner extends Mammal implements Walkable {

    public FourLegsOwner(String name, double lifetimeInDays, GeolocationPosition currentPosition) {
        super(name, lifetimeInDays, currentPosition);
    }


    @Override
    public void walk() {

    }

}
