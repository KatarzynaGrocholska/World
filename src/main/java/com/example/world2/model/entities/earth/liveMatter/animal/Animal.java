package com.example.world2.model.entities.earth.liveMatter.animal;

import com.example.world2.model.entities.earth.Earth;
import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.entities.earth.liveMatter.LiveMatter;
import com.example.world2.model.enums.FoodType;
import com.example.world2.model.enums.SkinType;
import com.example.world2.model.enums.TerrainType;
import com.example.world2.model.interfaces.Moveable;
import com.example.world2.model.interfaces.Stayable;

public abstract class Animal extends LiveMatter implements Moveable, Stayable {


    private final double jumpToBodySizeRatio;
    private boolean warmBlooded;
    private FoodType foodType;
    private SkinType skinType;

    private double movement;

    public Animal(String name, double maxLifetimeInSeconds, GeolocationPosition currentPosition, Earth earth,
                  double weightInGrams, double ageInSeconds, double widthInMillimeters, double heightInMillimeters,
                  double jumpToBodySizeRatio, boolean warmBlooded,
                  FoodType foodType, SkinType skinType, double movement, boolean isMakingNoise) {
        super(name, maxLifetimeInSeconds, currentPosition, earth, weightInGrams, ageInSeconds, widthInMillimeters, heightInMillimeters);
        this.jumpToBodySizeRatio = jumpToBodySizeRatio;
        this.warmBlooded = warmBlooded;
        this.foodType = foodType;
        this.skinType = skinType;
        this.movement = movement;
        this.isMakingNoise = isMakingNoise;
    }

    public boolean isMakingNoise() {
        return isMakingNoise;
    }

    public void setMakingNoise(boolean makingNoise) {
        isMakingNoise = makingNoise;
    }

    private boolean isMakingNoise;

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

    public double getJumpToBodySizeRatio() {
        return jumpToBodySizeRatio;
    }

    public double getMovement() {
        return movement;
    }

    public void setMovement(double movement) {
        this.movement = movement;
    }

    protected abstract boolean checkIfWalk(GeolocationPosition newGeolocationPosition);

    protected abstract boolean checkIfJump(GeolocationPosition newGeolocationPosition);

    @Override
    public void move(GeolocationPosition newGeolocationPosition) {

        this.setCurrentPosition(newGeolocationPosition);
    }


}
