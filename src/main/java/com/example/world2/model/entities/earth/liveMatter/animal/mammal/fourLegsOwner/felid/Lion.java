package com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner.felid;

import com.example.world2.model.entities.earth.Earth;
import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.enums.FoodType;
import com.example.world2.model.enums.SkinType;

public class Lion extends Felid {


    public Lion(String name, double maxLifetimeInSeconds, GeolocationPosition currentPosition, Earth earth,
                double weightInGrams, double ageInSeconds, double widthInMillimeters, double heightInMillimeters,
                double jumpToBodySizeRatio, FoodType foodType, SkinType skinType,
                GeolocationPosition movementTarget, int movement) {
        super(name, maxLifetimeInSeconds, currentPosition, earth, weightInGrams, ageInSeconds, widthInMillimeters,
                heightInMillimeters, jumpToBodySizeRatio, foodType, skinType, movementTarget, movement);
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

    @Override
    public void makeNoise() {

    }
}
