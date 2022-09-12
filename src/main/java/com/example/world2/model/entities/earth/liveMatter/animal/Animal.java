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

    public Animal(String name, double lifetimeInDays, GeolocationPosition currentPosition, Earth earth, double weight, double age, double size, boolean warmBlooded) {
        super(name, lifetimeInDays, currentPosition, earth, weight, age, size);
        this.warmBlooded = warmBlooded;
    }

    public boolean isMakingNoise() {
        return isMakingNoise;
    }

    public void setMakingNoise(boolean makingNoise) {
        isMakingNoise = makingNoise;
    }

    private boolean isMakingNoise;

    public Animal(String name, double lifetimeInDays, GeolocationPosition currentPosition,
                  Earth earth, double weight, double age, double size, boolean warmBlooded, FoodType foodType, SkinType skinType, boolean isMakingNoise) {
        super(name, lifetimeInDays, currentPosition, earth, weight, age, size);
        this.warmBlooded = warmBlooded;
        this.foodType = foodType;
        this.skinType = skinType;
        this.isMakingNoise = isMakingNoise;
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

    public TerrainType identifyTerrainType(GeolocationPosition geolocationPosition) {

        return super.getEarth().getFieldTerrainType(geolocationPosition);
    }

    public abstract boolean checkIfWalk(GeolocationPosition newGeolocationPosition);
    public abstract boolean checkIfJump(GeolocationPosition newGeolocationPosition);

}
