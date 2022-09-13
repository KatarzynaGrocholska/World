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

    GeolocationPosition geolocationPositionA = new GeolocationPosition(0, 0, 1);
    Earth earth = null;
    Cat cat = new Cat("Filemon",4730400000d,geolocationPositionA,
            earth, FoodType.ALL_FEEDING, SkinType.FUR,true, 3000d,
            31536000d,5000d,true,7d);

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

}
