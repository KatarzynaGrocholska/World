package com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner;

import com.example.world2.model.entities.earth.Earth;
import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.entities.earth.liveMatter.animal.mammal.landBased.LandBasedMammal;
import com.example.world2.model.enums.FoodType;
import com.example.world2.model.enums.SkinType;


public abstract class
FourLegsOwner extends LandBasedMammal {


    public FourLegsOwner(String name, double maxLifetimeInSeconds, GeolocationPosition currentPosition, Earth earth,
                         double weightInGrams, double ageInSeconds, double widthInMillimeters, double heightInMillimeters,
                         double jumpToBodySizeRatio,FoodType foodType, SkinType skinType, GeolocationPosition movementTarget, int movement) {
        super(name, maxLifetimeInSeconds, currentPosition, earth, weightInGrams, ageInSeconds, widthInMillimeters,
                heightInMillimeters, jumpToBodySizeRatio, foodType, skinType, movementTarget, movement);
    }
}
