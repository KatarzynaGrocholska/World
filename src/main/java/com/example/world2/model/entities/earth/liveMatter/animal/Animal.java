package com.example.world2.model.entities.earth.liveMatter.animal;

import com.example.world2.model.entities.earth.Earth;
import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.entities.earth.liveMatter.LiveMatter;
import com.example.world2.model.enums.FoodType;
import com.example.world2.model.enums.SkinType;
import com.example.world2.model.enums.TerrainType;
import com.example.world2.model.interfaces.Noisable;
import com.example.world2.model.interfaces.move.Moveable;
import com.example.world2.model.interfaces.move.Stayable;
import lombok.*;

@Setter
@Getter
public abstract class Animal extends LiveMatter implements Moveable, Stayable, Noisable {


    private final double jumpToBodySizeRatio;
    private FoodType foodType;
    private SkinType skinType;
    private GeolocationPosition movementTarget;
    private int movement;

    public Animal(String name, double maxLifetimeInSeconds, GeolocationPosition currentPosition, Earth earth,
                  double weightInGrams, double ageInSeconds, double widthInMillimeters, double heightInMillimeters,
                  double jumpToBodySizeRatio,FoodType foodType,SkinType skinType,GeolocationPosition movementTarget,int movement) {
        super(name, maxLifetimeInSeconds, currentPosition, earth, weightInGrams, ageInSeconds, widthInMillimeters,
                heightInMillimeters);
        this.jumpToBodySizeRatio=jumpToBodySizeRatio;
        this.foodType=foodType;
        this.skinType=skinType;
        this.movementTarget=movementTarget;
        this.movement=movement;
    }

    public boolean isMakingNoise() {
        return isMakingNoise;
    }

    public void setMakingNoise(boolean makingNoise) {
        isMakingNoise = makingNoise;
    }

    private boolean isMakingNoise;

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

    public int getMovement() {
        return movement;
    }

    public void setMovement(int movement) {
        this.movement = movement;
    }

    public void setMovementTarget(GeolocationPosition movementTarget){this.movementTarget=movementTarget;}
    public GeolocationPosition getMovementTarget(){return movementTarget;}

    protected abstract boolean checkIfWalk(GeolocationPosition newGeolocationPosition);

    protected abstract boolean checkIfJump(GeolocationPosition newGeolocationPosition);

    @Override
    public void move(GeolocationPosition newGeolocationPosition) {

        this.setCurrentPosition(newGeolocationPosition);
    }


}
