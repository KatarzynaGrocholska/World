package com.example.world2.data;

import com.example.world2.model.entities.earth.Earth;
import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner.felid.Cat;
import com.example.world2.model.enums.FoodType;
import com.example.world2.model.enums.SkinType;

public class CatData {



    public static Cat getFirstCat(){
        Earth earth = Earth.getInstance();
        GeolocationPosition geolocationPositionA = new GeolocationPosition(1, 0, 1);
        GeolocationPosition geolocationPositionB = new GeolocationPosition(100, 100, 1);
        return new Cat("Filemon",473000000,geolocationPositionA, earth,5000,
                365,5000,2500,7,true, FoodType.ALL_FEEDING,
                SkinType.FUR,geolocationPositionB,60);
    }

}
