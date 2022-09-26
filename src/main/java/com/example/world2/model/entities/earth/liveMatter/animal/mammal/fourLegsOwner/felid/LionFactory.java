package com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner.felid;

import com.example.world2.model.entities.earth.Earth;
import com.example.world2.model.entities.earth.EarthField;
import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.enums.FoodType;
import com.example.world2.model.enums.SkinType;

import java.util.Random;

public class LionFactory implements FelidFactory {

    private static final String BASE_LION_NAME = "Simba";
    private static final double JUMP_TO_BODY_SIZE_RATIO = 4.00;
    private static final FoodType FOOD_TYPE = FoodType.MEAT_FEEDING;
    private static final SkinType SKIN_TYPE = SkinType.FUR;
    private static final int MOVEMENT = 10;
    private static final int MAX_HIGH_VALUE = 10;
    private static final int MIN_HIGH_VALUE = 4;
    private static final int MAX_WIDTH_VALUE = 10;
    private static final int MIN_WIDTH_VALUE = 4;
    private static final int MIN_WEIGHT_VALUE = 100;
    private static final int MAX_WEIGHT_VALUE = 5000;
    private static final int MAX_AGE = 50000000;
    private static final int MAX_LIFE_TIME = 473040000;

    private Random generator = new Random();
    private int counterName = 0;

    @Override
    public Felid createFelid() {

        return createRandomLion();
    }

    public Lion createRandomLion() {
        Earth earth = Earth.getInstance();

        return new Lion(getNextName(), getNextLifetimeInSeconds(), getNextGeolocationPosition(),
                earth, getNextWeightInGrams(), getNextAge(), getNextWidth(), getNextHigh(), JUMP_TO_BODY_SIZE_RATIO,
                FOOD_TYPE, SKIN_TYPE, null, MOVEMENT);
    }

    private String getNextName() {
        String result = BASE_LION_NAME + counterName;
        counterName++;
        return result;
    }

    private double getNextHigh() {
        return generator.nextDouble(MIN_HIGH_VALUE, MAX_HIGH_VALUE);
    }

    private double getNextWidth() {
        return generator.nextDouble(MIN_WIDTH_VALUE, MAX_WIDTH_VALUE);
    }


    private double getNextAge() {
        return generator.nextDouble(MAX_AGE);
    }

    private GeolocationPosition getNextGeolocationPosition() {
        int x = generator.nextInt(EarthField.MAX_VALUE_XY);
        int y = generator.nextInt(EarthField.MAX_VALUE_XY);
        int z = generator.nextInt(EarthField.MAX_VALUE_Z);

        return new GeolocationPosition(x, y, z);

    }


    private double getNextLifetimeInSeconds() {
        Random random = new Random();

        return random.nextDouble(MAX_LIFE_TIME);
    }

    private double getNextWeightInGrams() {
        Random random = new Random();

        return random.nextDouble(MIN_WEIGHT_VALUE, MAX_WEIGHT_VALUE);
    }
}
