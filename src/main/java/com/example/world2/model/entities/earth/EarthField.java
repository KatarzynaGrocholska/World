package com.example.world2.model.entities.earth;

import com.example.world2.model.entities.Field;
import com.example.world2.model.enums.TerrainType;

public class EarthField {

    private static final int MAX_VALUE_XY = 100;
    private static final int MAX_VALUE_Z = 50;

    public static Field[][][] getEarthField() {
        Field[][][] map = new Field[MAX_VALUE_XY][MAX_VALUE_XY][MAX_VALUE_Z];


        for (int i = 0; i < MAX_VALUE_XY; i++) {
            for (int j = 0; j < MAX_VALUE_XY; j++) {
                for (int z = MAX_VALUE_Z / 2; z < MAX_VALUE_Z; z++) {

                    map[i][j][z] = new Field(TerrainType.AIR, new GeolocationPosition(i, j, z));
                }
            }
        }
        for (int i = 0; i < MAX_VALUE_XY; i++) {
            for (int j = 0; j < MAX_VALUE_XY / 2; j++) {
                for (int z = 0; z < MAX_VALUE_Z / 2; z++) {
                    map[i][j][z] = new Field(TerrainType.SALTY_WATER, new GeolocationPosition(i, j, z));
                }
            }
        }
        for (int i = 0; i < MAX_VALUE_XY; i++) {
            for (int j = MAX_VALUE_XY / 2; j < MAX_VALUE_XY; j++) {
                for (int z = 0; z < MAX_VALUE_Z / 2; z++) {
                    map[i][j][z] = new Field(TerrainType.STONE, new GeolocationPosition(i, j, z));
                }
            }
        }
        return map;
    }

}
