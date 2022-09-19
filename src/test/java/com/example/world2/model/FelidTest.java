package com.example.world2.model;

import com.example.world2.model.entities.earth.Earth;
import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner.felid.Cat;
import com.example.world2.model.enums.FoodType;
import com.example.world2.model.enums.SkinType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class FelidTest {

    GeolocationPosition geolocationPositionA = new GeolocationPosition(1, 0, 1);
    Earth earth = null;
    Cat cat = new  Cat("Filemon", 473000000, geolocationPositionA,
            earth,5000, 365, 5000,2500, 7, true,
            FoodType.ALL_FEEDING,SkinType.FUR,60,true );

    @Test
    void checkIfWalk_ShouldReturnTrue_WhenZIsConstant() {
        //given
        GeolocationPosition geolocationPositionB = new GeolocationPosition(1, 0, 1);
        boolean expected = true;
        //when
        boolean result = cat.checkIfWalk(geolocationPositionB);
        //then
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void checkIfWalk_ShouldReturnFalse_WhenZIsNotConstant() {
        //given
        GeolocationPosition geolocationPositionB = new GeolocationPosition(1, 0, 3);
        boolean expected = false;
        //when
        boolean result = cat.checkIfWalk(geolocationPositionB);
        //then
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void checkIfJump_ShouldReturnFalse_WhenZIsTooBig(){
        //given
        GeolocationPosition geolocationPositionB = new GeolocationPosition(1, 0, 36000);
        boolean expected = false;
        //when
        boolean result = cat.checkIfJump(geolocationPositionB);
        //then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void checkIfJump_ShouldReturnTrue_WhenZIsOk(){
        //given
        GeolocationPosition geolocationPositionB = new GeolocationPosition(1, 0, 2);
        boolean expected = true;
        //when
        boolean result = cat.checkIfJump(geolocationPositionB);
        //then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void walk_ShouldReturnNewGeolocationPosition_WhenAnimalIsGiven(){
        //given
        GeolocationPosition expected = new GeolocationPosition(61, 0, 3);
        //when
        GeolocationPosition result =cat.walk();
        //then
        assertThat(result.getX()).isEqualTo(expected.getX());
    }

    @Test
    void walk_ShouldReturnTooSmallXInGeolocationPosition_WhenAnimalIsGiven(){
        //given
        GeolocationPosition expected = new GeolocationPosition(10, 0, 3);
        //when
        GeolocationPosition result =cat.walk();
        //then
        assertThat(result).isNotEqualTo(expected);
    }

    @Test
    void walk_ShouldReturnTooBigXInGeolocationPosition_WhenAnimalIsGiven(){
        //given
        GeolocationPosition expected = new GeolocationPosition(105, 0, 3);
        //when
        GeolocationPosition result =cat.walk();
        //then
        assertThat(result).isNotEqualTo(expected);
    }

}
