package com.example.world2.model.interfaces.move;

import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.interfaces.move.Moveable;

public interface Swimable extends Moveable {
    GeolocationPosition swim ();
}
