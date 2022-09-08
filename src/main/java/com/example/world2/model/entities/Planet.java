package com.example.world2.model.entities;

import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.enums.TerrainType;

public abstract class Planet {
    private String name;
    private double radiusInKKm;
    private long distanceFromSunInKKm;
    private double rotationAroundSunTimeInHours;
    private double selfRotationTimeInHours;
    private Field[][][] map;


    public Planet(String name, double radiusInKKm, long distanceFromSunInKKm, double rotationAroundSunTimeInHours,
                  double selfRotationTimeInHours, Field[][][] map) {
        this.name = name;
        this.radiusInKKm = radiusInKKm;
        this.distanceFromSunInKKm = distanceFromSunInKKm;
        this.rotationAroundSunTimeInHours = rotationAroundSunTimeInHours;
        this.selfRotationTimeInHours = selfRotationTimeInHours;
        this.map = map;
    }

    public String getName() {
        return name;
    }

    public double getRadiusInKKm() {
        return radiusInKKm;
    }

    public long getDistanceFromSunInKKm() {
        return distanceFromSunInKKm;
    }

    public double getRotationAroundSunTimeInHours() {
        return rotationAroundSunTimeInHours;
    }

    public double getSelfRotationTimeInHours() {
        return selfRotationTimeInHours;
    }

    public Field[][][] getMap() {
        return map;
    }

    public TerrainType getFieldTerrainType(GeolocationPosition geolocationPosition) {

        return map[geolocationPosition.getX()][geolocationPosition.getY()][geolocationPosition.getZ()].getTerrainType();

    }


}
