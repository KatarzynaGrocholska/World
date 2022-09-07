package com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner.felid;

import com.example.world2.model.entities.earth.Earth;
import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner.FourLegsOwner;
import com.example.world2.model.enums.TerrainType;
import com.example.world2.model.interfaces.Climbable;
import com.example.world2.model.interfaces.Jumpable;
import com.example.world2.model.interfaces.Swimable;

public abstract class Felid extends FourLegsOwner implements Jumpable, Climbable, Swimable {

    public Felid(String name, double lifetimeInDays, GeolocationPosition currentPosition) {
        super(name, lifetimeInDays, currentPosition);
    }
    @Override
    public void move(GeolocationPosition newGeolocationPosition) {

        if(TerrainType.SALTY_WATER)
        if(getCurrentPosition().getZ()!= newGeolocationPosition.getZ()){
            climb();
            jump();
        }else{
            walk();
            jump();
            swim();
        }

    }

    @Override
    public void jump() {

    }

    @Override
    public void climb() {

    }
}
