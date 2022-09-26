package com.example.world2.model.entities.earth.liveMatter.animal.mammal.landBased;

import com.example.world2.model.entities.earth.Earth;
import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.entities.earth.liveMatter.animal.mammal.Mammal;
import com.example.world2.model.enums.FoodType;
import com.example.world2.model.enums.SkinType;
import com.example.world2.model.interfaces.move.Jumpable;
import com.example.world2.model.interfaces.move.Swimable;
import com.example.world2.model.interfaces.move.Walkable;


public abstract class LandBasedMammal extends Mammal implements Walkable, Swimable, Jumpable {


    public LandBasedMammal(String name, double maxLifetimeInSeconds, GeolocationPosition currentPosition, Earth earth,
                           double weightInGrams, double ageInSeconds, double widthInMillimeters, double heightInMillimeters,
                           double jumpToBodySizeRatio,  FoodType foodType, SkinType skinType, GeolocationPosition movementTarget, int movement) {
        super(name, maxLifetimeInSeconds, currentPosition, earth, weightInGrams, ageInSeconds, widthInMillimeters,
                heightInMillimeters, jumpToBodySizeRatio,  foodType, skinType, movementTarget, movement);
    }

    @Override
    public GeolocationPosition walk(GeolocationPosition geolocationPosition, GeolocationPosition movementTarget) {



        return null;
    }

    private boolean checkIfTheSamePoint(GeolocationPosition geolocationPosition, GeolocationPosition movementTarget){
       return geolocationPosition.equals(movementTarget);
    }

    private boolean checkIfFieldIsOnTheMap(GeolocationPosition geolocationPosition, GeolocationPosition movementTarget){
    return true;

    }
}
