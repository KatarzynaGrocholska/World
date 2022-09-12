package com.example.world2.model;

import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner.felid.Cat;
import com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner.felid.Felid;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class FelidTest {

    @Test
    void checkIfWalk_ShouldReturnTrue_WhenZIsConstant(){
        //given
        GeolocationPosition geolocationPositionA = new GeolocationPosition(0,0,0);
        GeolocationPosition geolocationPositionB = new GeolocationPosition(1,0,0);
        Cat cat = new Cat("Filemon" ,50,new GeolocationPosition(0,0,0));
        boolean expected = true;
        //when
        boolean result = cat.checkIfWalk(geolocationPositionB);
        //then
        assertThat(result).isEqualTo(expected);


}

}
