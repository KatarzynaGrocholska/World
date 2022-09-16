package com.example.world2.model.interfaces;

import com.example.world2.model.entities.earth.GeolocationPosition;

public interface Walkable extends Moveable{
    GeolocationPosition walk();
}
