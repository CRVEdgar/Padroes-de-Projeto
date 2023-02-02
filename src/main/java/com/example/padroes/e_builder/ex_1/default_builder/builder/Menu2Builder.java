package com.example.padroes.e_builder.ex_1.default_builder.builder;

import com.example.padroes.e_builder.ex_1.default_builder.builder.abstractClass.FastFoodMealBuilder;

public class Menu2Builder extends FastFoodMealBuilder {
    @Override
    public void buildDrink() {
        meal.setDrink("Water");
    }

    @Override
    public void buildMain() {
        meal.setMain("VeggieBurguer");
    }

    @Override
    public void buildSide() {
        meal.setSide("Salad");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Apple");
    }

    @Override
    public void buildGift() {
        meal.setToy("I'm Veggie's Stamp");
    }
}
