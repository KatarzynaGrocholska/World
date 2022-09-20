package com.example.world2.model.entities.earth.liveMatter.animal.mammal;

import com.example.world2.model.entities.earth.Earth;
import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.entities.earth.liveMatter.animal.Animal;
import com.example.world2.model.enums.FoodType;
import com.example.world2.model.enums.SkinType;
import com.example.world2.model.interfaces.Jumpable;
import com.example.world2.model.interfaces.Walkable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


public abstract class Mammal extends Animal {


    public Mammal(String name, double maxLifetimeInSeconds, GeolocationPosition currentPosition, Earth earth, double weightInGrams, double ageInSeconds, double widthInMillimeters, double heightInMillimeters, double jumpToBodySizeRatio) {
        super(name, maxLifetimeInSeconds, currentPosition, earth, weightInGrams, ageInSeconds, widthInMillimeters, heightInMillimeters, jumpToBodySizeRatio);
    }
}
