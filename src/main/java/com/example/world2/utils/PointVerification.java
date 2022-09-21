package com.example.world2.utils;

import com.example.world2.model.entities.earth.liveMatter.animal.Animal;

public class PointVerification {

    private static final int MAX_VALUE_XY = 1000000;
    private static final int MAX_VALUE_Z = 5000;

    private boolean checkXValue(Animal animal) {
        int x = animal.getMovementTarget().getX();

        return ((x >= 0) && (x < MAX_VALUE_XY));
    }

    private boolean checkYValue(Animal animal) {
        int y = animal.getMovementTarget().getY();

        return (y >= 0) && (y < MAX_VALUE_XY);
    }

    private boolean checkZValue(Animal animal) {
        int z = animal.getMovementTarget().getZ();

        return (z >= 0) && (z < MAX_VALUE_Z);
    }

    boolean pointVerification(Animal animal) {
        return checkXValue(animal) && checkYValue(animal) && checkZValue(animal);
    }


}
