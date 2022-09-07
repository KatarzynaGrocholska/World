package com.example.world2.model.entities.earth.liveMatter.animal;

import com.example.world2.model.entities.earth.Earth;
import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.entities.earth.liveMatter.LiveMatter;
import com.example.world2.model.enums.FoodType;
import com.example.world2.model.enums.SkinType;
import com.example.world2.model.enums.TerrainType;
import com.example.world2.model.interfaces.Moveable;

public abstract class Animal extends LiveMatter implements Moveable {

    private boolean warmBlooded ;
    private FoodType foodType;
    private SkinType skinType;

    public boolean isMakingNoise() {
        return isMakingNoise;
    }

    public void setMakingNoise(boolean makingNoise) {
        isMakingNoise = makingNoise;
    }

    private boolean isMakingNoise;

    public Animal(String name, double lifetimeInDays, GeolocationPosition currentPosition) {
        super(name, lifetimeInDays, currentPosition);
    }

    public boolean isWarmBlooded() {
        return warmBlooded;
    }

    public void setWarmBlooded(boolean warmBlooded) {
        this.warmBlooded = warmBlooded;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    public SkinType getSkinType() {
        return skinType;
    }

    public void setSkinType(SkinType skinType) {
        this.skinType = skinType;
    }


    public TerrainType identifyTerrainType(GeolocationPosition position){

        return
    }

}
