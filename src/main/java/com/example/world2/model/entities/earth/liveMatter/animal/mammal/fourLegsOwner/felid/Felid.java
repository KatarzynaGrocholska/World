package com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner.felid;

import com.example.world2.model.entities.earth.Earth;
import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner.FourLegsOwner;
import com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner.fourLegsOwnerFactory.FourLegsOwnerFactory;
import com.example.world2.model.enums.FoodType;
import com.example.world2.model.enums.SkinType;
import com.example.world2.model.interfaces.Climbable;

public abstract class Felid extends FourLegsOwner implements Climbable {


    public Felid(String name, double lifetimeInSeconds, GeolocationPosition currentPosition, Earth earth, FoodType foodType, SkinType skinType, boolean isMakingNoise, double weight,
                 double age, double size, boolean warmBlooded, double jumpToBodySizeRatio) {
        super(name, lifetimeInSeconds, currentPosition, earth, foodType, skinType, isMakingNoise, weight, age, size, warmBlooded, jumpToBodySizeRatio);
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


    }

    @Override
    public boolean checkIfWalk(GeolocationPosition newGeolocationPosition) {

        return getCurrentPosition().getZ() == newGeolocationPosition.getZ();
    }

    @Override
    public boolean checkIfJump(GeolocationPosition newGeolocationPosition) {
        return (newGeolocationPosition.getZ() - getCurrentPosition().getZ()) <=
                getJumpToBodySizeRatio() * getSizeInMillimeters();
    }

    @Override
    public void jump() {

    }

    @Override
    public void climb() {

    }
}
