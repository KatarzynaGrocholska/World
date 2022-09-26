package com.example.world2.utils;

import com.example.world2.data.CatData;
import com.example.world2.model.entities.earth.GeolocationPosition;
import com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner.felid.Cat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class PointVerificationTest {

    @InjectMocks
    private PointVerification pointVerification;

    @Test
    void pointVerification_ShouldReturnTrue_WhenFieldAreCorrect() {
        //given
        GeolocationPosition geolocationPosition = new GeolocationPosition(0, 99, 49);
        Cat cat = CatData.getFirstCat();
        cat.setMovementTarget(geolocationPosition);
        boolean expected = true;
        //when
        boolean result = pointVerification.pointVerification(cat);
        //then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void pointVerification_ShouldReturnFalse_WhenFieldXValueIsNegative() {
        //given
        GeolocationPosition geolocationPosition = new GeolocationPosition(-10, 10, 10);
        Cat cat = CatData.getFirstCat();
        cat.setMovementTarget(geolocationPosition);
        boolean expected = false;
        //when
        boolean result = pointVerification.pointVerification(cat);
        //then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void pointVerification_ShouldReturnFalse_WhenFieldXValueIsTooLarge() {
        //given
        GeolocationPosition geolocationPosition = new GeolocationPosition(200, 10, 10);
        Cat cat = CatData.getFirstCat();
        cat.setMovementTarget(geolocationPosition);
        boolean expected = false;
        //when
        boolean result = pointVerification.pointVerification(cat);
        //then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void pointVerification_ShouldReturnFalse_WhenFieldZValueIsTooLarge() {
        //given
        GeolocationPosition geolocationPosition = new GeolocationPosition(10, 10, 50);
        Cat cat = CatData.getFirstCat();
        cat.setMovementTarget(geolocationPosition);
        boolean expected = false;
        //when
        boolean result = pointVerification.pointVerification(cat);
        //then
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void pointVerification_ShouldReturnFalse_WhenFieldZValueIsNegative() {
        //given
        GeolocationPosition geolocationPosition = new GeolocationPosition(10, 10, -2);
        Cat cat = CatData.getFirstCat();
        cat.setMovementTarget(geolocationPosition);
        boolean expected = false;
        //when
        boolean result = pointVerification.pointVerification(cat);
        //then
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void pointVerification_ShouldReturnFalse_WhenFieldYValueIsTooLarge() {
        //given
        GeolocationPosition geolocationPosition = new GeolocationPosition(10, 200, 0);
        Cat cat = CatData.getFirstCat();
        cat.setMovementTarget(geolocationPosition);
        boolean expected = false;
        //when
        boolean result = pointVerification.pointVerification(cat);
        //then
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void pointVerification_ShouldReturnFalse_WhenFieldYValueIsNegative() {
        //given
        GeolocationPosition geolocationPosition = new GeolocationPosition(10, -10, 10);
        Cat cat = CatData.getFirstCat();
        cat.setMovementTarget(geolocationPosition);
        boolean expected = false;
        //when
        boolean result = pointVerification.pointVerification(cat);
        //then
        assertThat(result).isEqualTo(expected);
    }

}
