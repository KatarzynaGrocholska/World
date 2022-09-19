package com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner.felid;

import com.example.world2.model.entities.earth.Earth;
import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner.FourLegsOwner;
import com.example.world2.model.enums.FoodType;
import com.example.world2.model.enums.MoveType;
import com.example.world2.model.enums.SkinType;
import com.example.world2.model.interfaces.Climbable;

public abstract class Felid extends FourLegsOwner implements Climbable {


    public Felid(String name, double maxLifetimeInSeconds, GeolocationPosition currentPosition, Earth earth, double weightInGrams,
                 double ageInSeconds, double widthInMillimeters, double heightInMillimeters, double jumpToBodySizeRatio, boolean warmBlooded,
                 FoodType foodType, SkinType skinType, double movement, boolean isMakingNoise) {
        super(name, maxLifetimeInSeconds, currentPosition, earth, weightInGrams, ageInSeconds, widthInMillimeters,
                heightInMillimeters, jumpToBodySizeRatio, warmBlooded, foodType, skinType, movement, isMakingNoise);
    }

    @Override
    public void move(GeolocationPosition newGeolocationPosition) {

    }

    public MoveType chooseMovementType(GeolocationPosition newGeolocationPosition) {

        switch (super.identifyTerrainType(newGeolocationPosition)) {

            case SALTY_WATER:
            case SWEET_WATER:
                return MoveType.SWIM;

            case AIR:
                return MoveType.FLY;

            case SOIL:
            case STONE:
                if (checkIfWalk(newGeolocationPosition)) {
                    return MoveType.WALK;
                } else {
                    if (checkIfJump(newGeolocationPosition)) {
                        return MoveType.JUMP;
                    }
                    return MoveType.CLIMB;
                }
            default:
                return MoveType.WALK;
        }

    }

    GeolocationPosition performMovement(MoveType moveType, GeolocationPosition newGeolocationPosition) {
        switch (chooseMovementType(newGeolocationPosition)) {
            case WALK:
                return walk();
            case JUMP:
                return jump();
            case SWIM:
                return swim();
            case CLIMB:
                return climb();
            default:
                return stay();
        }
    }


    @Override
    protected boolean checkIfWalk(GeolocationPosition newGeolocationPosition) {

        return getCurrentPosition().getZ() == newGeolocationPosition.getZ();
    }

    @Override
    protected boolean checkIfJump(GeolocationPosition newGeolocationPosition) {
        return (newGeolocationPosition.getZ() - getCurrentPosition().getZ()) <=
                getJumpToBodySizeRatio() * getWidthInMillimeters();
    }

    @Override
    public GeolocationPosition jump() {
        return null;
    }

    @Override
    public GeolocationPosition climb() {
        return null;
    }
}
