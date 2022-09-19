package com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner.felid;

import com.example.world2.model.entities.earth.Earth;
import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.enums.FoodType;
import com.example.world2.model.enums.SkinType;

public class Lion extends Felid {

    public Lion(String name, double maxLifetimeInSeconds, GeolocationPosition currentPosition, Earth earth, double weightInGrams,
                double ageInSeconds, double widthInMillimeters, double heightInMillimeters, double jumpToBodySizeRatio, boolean warmBlooded,
                FoodType foodType, SkinType skinType, int movement, boolean isMakingNoise) {
        super(name, maxLifetimeInSeconds, currentPosition, earth, weightInGrams, ageInSeconds, widthInMillimeters,
                heightInMillimeters, jumpToBodySizeRatio, warmBlooded, foodType, skinType, movement, isMakingNoise);
    }

    @Override
    public void move(GeolocationPosition newGeolocationPosition) {

    }

    @Override
    public GeolocationPosition swim() {
        return null;
    }

    @Override
    public GeolocationPosition stay() {
        return null;
    }
}
