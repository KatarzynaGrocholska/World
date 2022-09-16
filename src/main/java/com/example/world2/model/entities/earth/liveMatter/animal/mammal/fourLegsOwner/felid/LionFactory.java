package com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner.felid;

import com.example.world2.model.entities.earth.Earth;
import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.enums.FoodType;
import com.example.world2.model.enums.SkinType;

import java.util.List;
import java.util.Random;

public class LionFactory implements FelidFactory{

    private static final String BASE_LION_NAME = "Simba";
    private static final double JUMP_TO_BODY_SIZE_RATIO = 4.00;
    private static final boolean WARM_BLOODED = true;
    private static final boolean IS_MAKING_NOISE = true;
    private static final FoodType FOOD_TYPE =FoodType.MEAT_FEEDING;
    private static final SkinType SKIN_TYPE = SkinType.FUR;

    private Random generator = new Random();

    @Override
    public Felid createFelid() {

        return createRandomLion();
    }

    public Lion createRandomLion(){
        Earth earth = Earth.getInstance();

        return new Lion(getNextName(),getNextLifetimeInSeconds(),getNextGeolocationPosition(),earth,getNextWeightInGrams()
                ,getNextLifetimeInSeconds(),getNextWidth(),getNextHigh(),JUMP_TO_BODY_SIZE_RATIO,WARM_BLOODED,FOOD_TYPE,SKIN_TYPE,true);
    }

    private String getNextName() {
        int counter = 0;
        String result = BASE_LION_NAME + counter;
        counter++;
        return result;
    }
    private double getNextHigh() {
        return generator.nextDouble(100, 500);
    }

    private double getNextWidth() {
        return generator.nextDouble(100, 500);
    }


    private double getNextSize() {
        return generator.nextDouble(1000, 5000);
    }

    private double getNextAge() {
        return generator.nextDouble(50000000);
    }

    private GeolocationPosition getNextGeolocationPosition() {
        int x = generator.nextInt(1000000);
        int y = generator.nextInt(1000000);
        int z = generator.nextInt(5000);

        return new GeolocationPosition(x, y, z);

    }


    private double getNextLifetimeInSeconds() {
        Random random = new Random();

        return random.nextDouble(473040000);
    }

    private double getNextWeightInGrams() {
        Random random = new Random();

        return random.nextDouble(100, 5000);
    }
}
