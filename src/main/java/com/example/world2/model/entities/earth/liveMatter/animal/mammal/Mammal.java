package com.example.world2.model.entities.earth.liveMatter.animal.mammal;

import com.example.world2.model.entities.earth.Earth;
import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.entities.earth.liveMatter.animal.Animal;
import com.example.world2.model.enums.FoodType;
import com.example.world2.model.enums.SkinType;
import com.example.world2.model.interfaces.Jumpable;
import com.example.world2.model.interfaces.Walkable;

public abstract class Mammal extends Animal {


    public Mammal(String name, double lifetimeInSeconds, GeolocationPosition currentPosition, Earth earth,
                  FoodType foodType, SkinType skinType, boolean isMakingNoise,
                  double weight, double age, double size, boolean warmBlooded,
                  double jumpToBodySizeRatio) {
        super(name, lifetimeInSeconds, currentPosition, earth, weight, age, size, warmBlooded,
                foodType, skinType, isMakingNoise,
                jumpToBodySizeRatio);
    }
}
