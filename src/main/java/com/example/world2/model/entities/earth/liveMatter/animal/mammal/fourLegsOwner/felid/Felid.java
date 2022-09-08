package com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner.felid;

import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner.FourLegsOwner;
import com.example.world2.model.interfaces.Climbable;
import com.example.world2.model.interfaces.Jumpable;
import com.example.world2.model.interfaces.Swimable;

public abstract class Felid extends FourLegsOwner implements Jumpable, Climbable, Swimable {

    public Felid(String name, double lifetimeInDays, GeolocationPosition currentPosition) {
        super(name, lifetimeInDays, currentPosition);
    }

    @Override
    public void move(GeolocationPosition newGeolocationPosition) {

        switch (super.identifyTerrainType(newGeolocationPosition)) {
            case SALTY_WATER:
            case SWEET_WATER:
                swim();
                break;
            case AIR:
                jump();
                break;
            case SOIL:
            case STONE:
                if (checkIfWalk(newGeolocationPosition)) {
                    walk();
                } else {
                    if (checkIfJump(newGeolocationPosition)) {
                        jump();
                    }
                    climb();
                }
                break;
        }

/*
        if(TerrainType.SALTY_WATER)
        if(getCurrentPosition().getZ()!= newGeolocationPosition.getZ()){
            climb();
            jump();
        }else{
            walk();
            jump();
            swim();
        }*/

    }

    @Override
    public boolean checkIfWalk(GeolocationPosition newGeolocationPosition) {

        return getCurrentPosition().getZ() == newGeolocationPosition.getZ();
    }

    @Override
    public boolean checkIfJump(GeolocationPosition newGeolocationPosition) {
        return (newGeolocationPosition.getZ() - getCurrentPosition().getZ()) <= 7 * getSize();// koty skaczą do siedmiokrotności swojego wzrostu
    }

    @Override
    public void jump() {

    }

    @Override
    public void climb() {

    }
}
