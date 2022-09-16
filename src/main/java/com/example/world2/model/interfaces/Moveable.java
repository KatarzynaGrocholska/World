package com.example.world2.model.interfaces;

import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.entities.earth.liveMatter.animal.Animal;

public interface Moveable {

    void move(GeolocationPosition newGeolocationPosition);
}
