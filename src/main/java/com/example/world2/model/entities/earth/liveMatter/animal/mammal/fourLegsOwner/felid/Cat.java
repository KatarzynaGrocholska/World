package com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner.felid;

import com.example.world2.model.entities.earth.Earth;
import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.enums.FoodType;
import com.example.world2.model.enums.SkinType;

public class Cat extends Felid {


    public Cat(String name, double lifetimeInSeconds, GeolocationPosition currentPosition, Earth earth, FoodType foodType, SkinType skinType, boolean isMakingNoise,
               double weight, double age, double size, boolean warmBlooded,
               double jumpToBodySizeRatio) {
        super(name, lifetimeInSeconds, currentPosition,
                earth, foodType, skinType, isMakingNoise, weight, age, size,
                warmBlooded, jumpToBodySizeRatio);
    }

    @Override
    public void swim() {

    }


}
