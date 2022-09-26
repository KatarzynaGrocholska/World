package com.example.world2.model.entities.earth;

import com.example.world2.model.entities.Field;
import com.example.world2.model.entities.Planet;


public class Earth extends Planet {


    private Earth(String name, double radiusInKKm, long distanceFromSunInKKm, double rotationAroundSunTimeInHours, double selfRotationTimeInHours, Field[][][] map) {
        super(name, radiusInKKm, distanceFromSunInKKm, rotationAroundSunTimeInHours, selfRotationTimeInHours, map);
    }


    private static Earth earth;
    private static Field[][][] map = EarthField.getEarthField();

    public static Earth getInstance() {
        if (earth == null) {
            earth = new Earth("Earth", 6378, 150480000, 8760, 24, map);
        }
        return earth;
    }
}
