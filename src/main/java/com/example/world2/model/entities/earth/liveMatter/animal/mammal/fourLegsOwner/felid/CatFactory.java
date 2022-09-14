package com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner.felid;

import com.example.world2.model.entities.earth.Earth;
import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.enums.FoodType;
import com.example.world2.model.enums.SkinType;

import java.util.Random;

public class CatFactory implements FelidFactory {

    private static final String BASE_CAT_NAME = "Filemon";

    Random generator = new Random();

    @Override
    public Felid createFelid() {

        return new Cat();

    }

    private Cat createRandomCat() {
        GeolocationPosition geolocationPositionA = new GeolocationPosition(0, 0, 1);
        Earth earth =Earth.getInstance();

        return new Cat(getName(), getLifetimeInSeconds(), getGeolocationPosition(),
                earth, FoodType.ALL_FEEDING, SkinType.FUR, true, 3000d,
                31536000d, 5000d, true, 7d);

    }

    private String getName() {
        int counter = 0;
        String result = BASE_CAT_NAME + counter;
        counter++;
        return result;
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
