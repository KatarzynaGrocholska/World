package com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner.felid;

import com.example.world2.model.entities.earth.Earth;
import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner.FourLegsOwner;
import com.example.world2.model.enums.FoodType;
import com.example.world2.model.enums.SkinType;
import com.example.world2.model.interfaces.Climbable;

public abstract class Felid extends FourLegsOwner implements Climbable {


    public Felid(String name, double lifetimeInSeconds, GeolocationPosition currentPosition, Earth earth,
                 double weightInGrams, double ageInSeconds, double widthInMillimeters, double heightInMillimeters, double jumpToBodySizeRatio, boolean warmBlooded,
                 FoodType foodType, SkinType skinType, boolean isMakingNoise) {
        super(name, lifetimeInSeconds, currentPosition, earth, weightInGrams, ageInSeconds, widthInMillimeters, heightInMillimeters, jumpToBodySizeRatio, warmBlooded, foodType, skinType, isMakingNoise);
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
                getJumpToBodySizeRatio() * getWidthInMillimeters();
    }

    @Override
    public void jump() {

    }

    @Override
    public void climb() {

    }
}
