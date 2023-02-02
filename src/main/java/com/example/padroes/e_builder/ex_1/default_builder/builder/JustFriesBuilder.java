package com.example.padroes.e_builder.ex_1.default_builder.builder;

import com.example.padroes.e_builder.ex_1.default_builder.builder.abstractClass.FastFoodMealBuilder;

public class JustFriesBuilder extends FastFoodMealBuilder {
    @Override
    public void buildDrink() {
        // no drink
    }

    @Override
    public void buildMain() {
        // no main
    }

    @Override
    public void buildSide() {
        meal.setSide("Large Fries");
    }

    @Override
    public void buildDessert() {
        // no dessert
    }

    @Override
    public void buildGift() {
        // no gift
    }
}
