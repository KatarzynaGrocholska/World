package com.example.world2.model.entities.earth;

import com.example.world2.model.abstracts.Planet;
import com.example.world2.model.enums.TerrainType;


public class Earth extends Planet {


    public Earth(String name, double radiusInKKm, long distanceFromSunInKKm, double rotationAroundSunTimeInHours, double selfRotationTimeInHours, TerrainType[][][] map) {
        super(name, radiusInKKm, distanceFromSunInKKm, rotationAroundSunTimeInHours, selfRotationTimeInHours, map);
    }

}
