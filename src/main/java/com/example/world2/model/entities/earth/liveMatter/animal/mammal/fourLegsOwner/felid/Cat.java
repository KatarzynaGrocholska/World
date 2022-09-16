package com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner.felid;

import com.example.world2.model.entities.earth.Earth;
import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.enums.FoodType;
import com.example.world2.model.enums.SkinType;

public class Cat extends Felid {

    public Cat(String name, double lifetimeInSeconds, GeolocationPosition currentPosition, Earth earth, double weightInGrams,
               double ageInSeconds, double widthInMillimeters, double heightInMillimeters, double jumpToBodySizeRatio,
               boolean warmBlooded, FoodType foodType, SkinType skinType, boolean isMakingNoise) {
        super(name, lifetimeInSeconds, currentPosition, earth, weightInGrams, ageInSeconds,
                widthInMillimeters, heightInMillimeters, jumpToBodySizeRatio, warmBlooded, foodType, skinType, isMakingNoise);
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
