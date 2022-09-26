package com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner.felid;

import com.example.world2.model.entities.earth.Earth;
import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner.FourLegsOwner;
import com.example.world2.model.enums.FoodType;
import com.example.world2.model.enums.MoveType;
import com.example.world2.model.enums.SkinType;
import com.example.world2.model.interfaces.move.Climbable;

public abstract class Felid extends FourLegsOwner implements Climbable {


    public Felid(String name, double maxLifetimeInSeconds, GeolocationPosition currentPosition, Earth earth,
                 double weightInGrams, double ageInSeconds, double widthInMillimeters, double heightInMillimeters,
                 double jumpToBodySizeRatio, FoodType foodType, SkinType skinType, GeolocationPosition movementTarget, int movement) {
        super(name, maxLifetimeInSeconds, currentPosition, earth, weightInGrams, ageInSeconds, widthInMillimeters,
                heightInMillimeters, jumpToBodySizeRatio, foodType, skinType, movementTarget, movement);
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

    public GeolocationPosition walk() {

        GeolocationPosition result = getCurrentPosition();
        if (this.getCurrentPosition().getX() - this.getMovementTarget().getX() > 0) {
            result.setX(getCurrentPosition().getX() - 1);
        } else if (this.getCurrentPosition().getX() - this.getMovementTarget().getX() < 0) {
            result.setX(getCurrentPosition().getX() + 1);
        } else if (this.getCurrentPosition().getX() - this.getMovementTarget().getX() == 0) {
            if (this.getCurrentPosition().getY() - this.getMovementTarget().getY() > 0) {
                result.setY(getCurrentPosition().getY() - 1);
            } else if (this.getCurrentPosition().getY() - this.getMovementTarget().getY() < 0) {
                result.setY(getCurrentPosition().getY() + 1);
            }

        }
        return result;
    }
        private boolean checkIfTargetIsReached(){
            return this.getCurrentPosition().equals(this.getMovementTarget());
        }

        private GeolocationPosition makeStep () {
           return this.getCurrentPosition();

        }


        @Override
        public boolean checkIfWalk (GeolocationPosition newGeolocationPosition){

            return getCurrentPosition().getZ() == newGeolocationPosition.getZ();
        }

        @Override
        public boolean checkIfJump (GeolocationPosition newGeolocationPosition){
            return (newGeolocationPosition.getZ() - getCurrentPosition().getZ()) <=
                    getJumpToBodySizeRatio() * getWidthInMillimeters();
        }

        @Override
        public GeolocationPosition jump () {
            return null;
        }

        @Override
        public GeolocationPosition climb () {
            return null;
        }
    }
