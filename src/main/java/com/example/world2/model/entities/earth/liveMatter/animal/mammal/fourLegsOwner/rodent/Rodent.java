package com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner.rodent;

import com.example.world2.model.entities.earth.Earth;
import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner.FourLegsOwner;
import com.example.world2.model.enums.FoodType;
import com.example.world2.model.enums.SkinType;

public abstract class Rodent extends FourLegsOwner {
    public Rodent(String name, double lifetimeInSeconds, GeolocationPosition currentPosition, Earth earth, double weightInGrams, double ageInSeconds, double widthInMillimeters, double heightInMillimeters, double jumpToBodySizeRatio, boolean warmBlooded, FoodType foodType, SkinType skinType, boolean isMakingNoise) {
        super(name, lifetimeInSeconds, currentPosition, earth, weightInGrams, ageInSeconds, widthInMillimeters, heightInMillimeters, jumpToBodySizeRatio, warmBlooded, foodType, skinType, isMakingNoise);
    }

    @Override
    public boolean checkIfWalk(GeolocationPosition newGeolocationPosition) {
        return false;
    }

    @Override
    public boolean checkIfJump(GeolocationPosition newGeolocationPosition) {
        return false;
    }

    @Override
    public GeolocationPosition jump() {
return null;
    }

    @Override
    public GeolocationPosition swim() {
        return null;
    }
}
