//package com.example.world2.model.entities.earth.liveMatter.animal.mammal.fourLegsOwner.felid;
//
//import com.example.world2.model.entities.earth.Earth;
//import com.example.world2.model.entities.earth.GeolocationPosition;
//import com.example.world2.model.enums.FoodType;
//import com.example.world2.model.enums.SkinType;
//
//import java.util.List;
//import java.util.Random;
//
//public class CatFactory implements FelidFactory {
//
//    private static final String BASE_CAT_NAME = "Filem      on";
//    private static final double JUMP_TO_BODY_SIZE_RATIO = 7.00;
//    private static final boolean WARM_BLOODED = true;
//    private static final boolean IS_MAKING_NOISE = true;
//
//    Random generator = new Random();
//
//    @Override
//    public Felid createFelid() {
//
//        return createRandomCat();
//    }
//
//    private Cat createRandomCat() {
//        Earth earth = Earth.getInstance();
//
//        return new Cat(getNextName(), getNextLifetimeInSeconds(), getNextGeolocationPosition(),
//                earth, getNextFoodType(), getNextSkinType(), IS_MAKING_NOISE, getNextWeightInGrams(),
//                getNextAge(), getNextSize(), WARM_BLOODED, JUMP_TO_BODY_SIZE_RATIO);
//
//    }
//
//    private String getNextName() {
//        int counter = 0;
//        String result = BASE_CAT_NAME + counter;
//        counter++;
//        return result;
//    }
//
//    private double getNextSize() {
//        return generator.nextDouble(1000, 5000);
//    }
//
//    private double getNextAge() {
//        return generator.nextDouble(50000000);
//    }
//
//    private GeolocationPosition getNextGeolocationPosition() {
//        int x = generator.nextInt(1000000);
//        int y = generator.nextInt(1000000);
//        int z = generator.nextInt(5000);
//
//        return new GeolocationPosition(x, y, z);
//
//    }
//
//
//    private double getNextLifetimeInSeconds() {
//        Random random = new Random();
//
//        return random.nextDouble(473040000);
//    }
//
//    private double getNextWeightInGrams() {
//        Random random = new Random();
//
//        return random.nextDouble(100, 5000);
//    }
//
//    private FoodType getNextFoodType() {
//        List<FoodType> values =
//                List.of(FoodType.MEAT_FEEDING, FoodType.ALL_FEEDING);
//        int SIZE = values.size();
//
//        return values.get(generator.nextInt(SIZE));
//    }
//
//    private SkinType getNextSkinType() {
//        List<SkinType> values =
//                List.of(SkinType.SKIN, SkinType.FUR);
//        int SIZE = values.size();
//
//        return values.get(generator.nextInt(SIZE));
//    }
//
//}
