package com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner.rodent;

import com.example.world2.model.entities.earth.Earth;
import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.enums.FoodType;
import com.example.world2.model.enums.SkinType;

import java.util.Random;


public class MouseFactory implements RodentFactory {

    private static final String BASE_MOUSE_NAME = "Jerry";
    private static final double JUMP_TO_BODY_SIZE_RATIO = 3.50;
    private static final boolean WARM_BLOODED = true;
    private static final boolean IS_MAKING_NOISE = true;
    private static final double MAX_LIFETIME_IN_SECONDS = 47304000;

    Random generator = new Random();

    @Override
    public Rodent createRodent() {
        return createRandomMouse();
    }

    public Mouse createRandomMouse() {
        Earth earth = Earth.getInstance();
        return new Mouse(getNextName(), MAX_LIFETIME_IN_SECONDS, getNextGeolocationPosition(), earth, getNextWeightInGrams(),
                getNextAge(), getNextWidth(), getNextHigh(), JUMP_TO_BODY_SIZE_RATIO, WARM_BLOODED,
                FoodType.ALL_FEEDING, SkinType.FUR,30, IS_MAKING_NOISE);
    }
    public Mouse createRandomMouseOnPosition(int x,int y,int z) {
        GeolocationPosition geolocationPosition = new GeolocationPosition(x,y,z);
        Earth earth = Earth.getInstance();
        return new Mouse(getNextName(), MAX_LIFETIME_IN_SECONDS, geolocationPosition, earth, getNextWeightInGrams(),
                getNextAge(), getNextWidth(), getNextHigh(), JUMP_TO_BODY_SIZE_RATIO, WARM_BLOODED,
                FoodType.ALL_FEEDING, SkinType.FUR,30, IS_MAKING_NOISE);
    }

    private String getNextName() {
        int counter = 0;
        String result = BASE_MOUSE_NAME + counter;
        counter++;
        return result;
    }

    private double getNextHigh() {
        return generator.nextDouble(100, 500);
    }

    private double getNextWidth() {
        return generator.nextDouble(100, 500);
    }

    private double getNextAge() {
        return generator.nextDouble(47304000);
    }

    private GeolocationPosition getNextGeolocationPosition() {
        int x = generator.nextInt(1000000);
        int y = generator.nextInt(1000000);
        int z = generator.nextInt(5000);

        return new GeolocationPosition(x, y, z);

    }

    private double getNextWeightInGrams() {
        Random random = new Random();

        return random.nextDouble(100, 5000);
    }

}
