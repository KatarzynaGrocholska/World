package com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner;

import com.example.world2.model.entities.earth.Earth;
import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.entities.earth.liveMatter.animal.mammal.Mammal;
import com.example.world2.model.enums.FoodType;
import com.example.world2.model.enums.SkinType;
import com.example.world2.model.interfaces.Jumpable;
import com.example.world2.model.interfaces.Swimable;
import com.example.world2.model.interfaces.Walkable;

public abstract class FourLegsOwner extends Mammal implements Walkable, Swimable, Jumpable {


    public FourLegsOwner(String name, double lifetimeInSeconds, GeolocationPosition currentPosition, Earth earth,
                         double weightInGrams, double ageInSeconds, double widthInMillimeters, double heightInMillimeters,
                         double jumpToBodySizeRatio, boolean warmBlooded, FoodType foodType, SkinType skinType, boolean isMakingNoise) {
        super(name, lifetimeInSeconds, currentPosition, earth, weightInGrams, ageInSeconds, widthInMillimeters, heightInMillimeters,
                jumpToBodySizeRatio, warmBlooded, foodType, skinType, isMakingNoise);
    }

    @Override
    public GeolocationPosition walk() {
return null;
    }

}
