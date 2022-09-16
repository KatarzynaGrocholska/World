package com.example.world2.model.interfaces;

import com.example.world2.model.entities.earth.GeolocationPosition;

public interface Flyable extends Moveable{
    GeolocationPosition fly ();
}
