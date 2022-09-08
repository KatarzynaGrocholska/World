package com.example.world2.model.entities;

import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.enums.TerrainType;

import java.util.Objects;

public class Field {

    private TerrainType terrainType;
    private GeolocationPosition geolocationPosition;

    public Field(TerrainType terrainType, GeolocationPosition geolocationPosition) {
        this.terrainType = terrainType;
        this.geolocationPosition = geolocationPosition;
    }

    public TerrainType getTerrainType() {
        return terrainType;
    }

    public void setTerrainType(TerrainType terrainType) {
        this.terrainType = terrainType;
    }

    public GeolocationPosition getGeolocationPosition() {
        return geolocationPosition;
    }

    public void setGeolocationPosition(GeolocationPosition geolocationPosition) {
        this.geolocationPosition = geolocationPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Field)) return false;
        Field field = (Field) o;
        return getTerrainType() == field.getTerrainType() && Objects.equals(getGeolocationPosition(), field.getGeolocationPosition());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTerrainType(), getGeolocationPosition());
    }
}
