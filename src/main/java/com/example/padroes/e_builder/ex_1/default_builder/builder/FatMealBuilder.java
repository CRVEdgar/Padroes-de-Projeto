package com.example.padroes.e_builder.ex_1.default_builder.builder;

import com.example.padroes.e_builder.ex_1.default_builder.builder.abstractClass.FastFoodMealBuilder;
import com.example.padroes.e_builder.ex_1.default_builder.model.FastFoodMeal;

public class FatMealBuilder extends FastFoodMealBuilder {

    @Override
    public void buildDrink() {
        meal.setDrink("MilkShake");
    }

    @Override
    public void buildMain() {
        meal.setMain("TripleCheddarBaconBurguer");
    }

    @Override
    public void buildSide() {
        meal.setSide("Onion Rings");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Large IceCream");
    }

    @Override
    public void buildGift() {
        meal.setToy("Hospital pass");
    }
}
