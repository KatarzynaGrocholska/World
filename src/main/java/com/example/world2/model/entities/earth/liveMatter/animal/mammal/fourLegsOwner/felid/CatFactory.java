package com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner.felid;

import com.example.world2.model.entities.earth.Earth;
import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.enums.FoodType;
import com.example.world2.model.enums.SkinType;

import java.util.Random;

public class CatFactory implements FelidFactory {

    private static final String BASE_CAT_NAME = "Filemon";
    private static final double JUMP_TO_BODY_SIZE_RATIO = 7.00;
    private static final boolean WARM_BLOODED = true;

    Random generator = new Random();

    @Override
    public Felid createFelid() {

        return new Cat();

    }

    private Cat createRandomCat() {
        Earth earth =Earth.getInstance();

        return new Cat(getName(), getLifetimeInSeconds(), getGeolocationPosition(),
                earth, FoodType.ALL_FEEDING, SkinType.FUR, true, 3000d,
                getAge(), getSize(), WARM_BLOODED, JUMP_TO_BODY_SIZE_RATIO);

    }

    private String getName() {
        int counter = 0;
        String result = BASE_CAT_NAME + counter;
        counter++;
        return result;
    }

    private double getSize(){
        return generator.nextDouble(1000,5000);
    }
    private double getAge(){
        return generator.nextDouble(50000000);
    }

    private GeolocationPosition getGeolocationPosition(){
        int x = generator.nextInt(1000000);
        int y = generator.nextInt(1000000);
        int z = generator.nextInt(5000);

        return new GeolocationPosition(x,y,z);

    }


    private double getLifetimeInSeconds() {
        Random random = new Random();

        return random.nextDouble(5000);
    }

}
