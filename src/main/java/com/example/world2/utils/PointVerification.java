package com.example.world2.utils;

import com.example.world2.model.entities.earth.EarthField;
import com.example.world2.model.entities.earth.liveMatter.animal.Animal;

public class PointVerification {

    private boolean checkXValue(Animal animal) {
        int x = animal.getMovementTarget().getX();
        return ((x >= 0) && (x < EarthField.MAX_VALUE_XY));
    }

    private boolean checkYValue(Animal animal) {
        int y = animal.getMovementTarget().getY();

        return (y >= 0) && (y < EarthField.MAX_VALUE_XY);
    }

    private boolean checkZValue(Animal animal) {
        int z = animal.getMovementTarget().getZ();

        return (z >= 0) && (z < EarthField.MAX_VALUE_Z);
    }

    boolean pointVerification(Animal animal) {
        return checkXValue(animal) && checkYValue(animal) && checkZValue(animal);
    }


}
