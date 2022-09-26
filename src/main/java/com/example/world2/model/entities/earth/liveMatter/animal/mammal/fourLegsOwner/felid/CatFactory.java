package com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner.felid;

import com.example.world2.model.entities.earth.Earth;
import com.example.world2.model.entities.earth.EarthField;
import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.enums.FoodType;
import com.example.world2.model.enums.SkinType;

import java.util.List;
import java.util.Random;

public class CatFactory implements FelidFactory {

    private static final String BASE_CAT_NAME = "Filemon";
    private static final double JUMP_TO_BODY_SIZE_RATIO = 7.00;
    private static final int MOVEMENT = 6;
    private static final int MAX_HIGH_VALUE = 5;
    private static final int MIN_HIGH_VALUE = 2;
    private static final int MAX_WIDTH_VALUE = 5;
    private static final int MIN_WIDTH_VALUE = 2;
    private static final int MIN_WEIGHT_VALUE = 100;
    private static final int MAX_WEIGHT_VALUE = 5000;
    private static final int MAX_AGE = 50000000;
    private static final int MAX_LIFE_TIME = 473040000;

    Random generator = new Random();
    private int counterName = 0;

    @Override
    public Felid createFelid() {

        return createRandomCat();
    }

    private Cat createRandomCat() {
        Earth earth = Earth.getInstance();

        return new Cat(getNextName(), getNextLifetimeInSeconds(), getNextGeolocationPosition(),
                earth, getNextWeightInGrams(), getNextAge(), getNextWidth(), getNextHigh(), JUMP_TO_BODY_SIZE_RATIO,
                getNextFoodType(), getNextSkinType(), null, MOVEMENT);

    }

    private String getNextName() {
        String result = BASE_CAT_NAME + counterName;
        counterName++;
        return result;
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

    private FoodType getNextFoodType() {
        List<FoodType> values =
                List.of(FoodType.MEAT_FEEDING, FoodType.ALL_FEEDING);
        int SIZE = values.size();

        return values.get(generator.nextInt(SIZE));
    }

    private SkinType getNextSkinType() {
        List<SkinType> values =
                List.of(SkinType.SKIN, SkinType.FUR);
        int SIZE = values.size();

        return values.get(generator.nextInt(SIZE));
    }

    private double getNextHigh() {
        return generator.nextDouble(MIN_HIGH_VALUE, MAX_HIGH_VALUE);
    }

    private double getNextWidth() {
        return generator.nextDouble(MIN_WIDTH_VALUE, MAX_WIDTH_VALUE);
    }

}
