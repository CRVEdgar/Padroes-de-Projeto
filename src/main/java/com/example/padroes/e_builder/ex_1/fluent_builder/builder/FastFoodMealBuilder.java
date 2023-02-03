package com.example.padroes.e_builder.ex_1.fluent_builder.builder;

import com.example.padroes.e_builder.ex_1.fluent_builder.model.FastFoodMeal;

public class FastFoodMealBuilder {
    //Mandatory
    private String side;

    //Optionals
    private String drink;
    private String main;
    private String dessert;
    private String gift;

    public FastFoodMealBuilder(String side) {
        this.side = side;
    }

    public FastFoodMealBuilder forDrink(String drink) {
        this.drink = drink;
        return this; /** return instance of Build */
    }

    public FastFoodMealBuilder andMain(String main) {
        this.main = main;
        return this;
    }

    public FastFoodMealBuilder andDessert(String dessert) {
        this.dessert = dessert;
        return this;
    }

    public FastFoodMealBuilder andGift(String gift) {
        this.gift = gift;
        return this;
    }

    /** return Object from Domain Model */
    public FastFoodMeal thatsAll() {
        return new FastFoodMeal(drink, main, side, dessert, gift);
    }
}
