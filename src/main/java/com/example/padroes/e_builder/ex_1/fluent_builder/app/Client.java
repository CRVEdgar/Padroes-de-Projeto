package com.example.padroes.e_builder.ex_1.fluent_builder.app;

import com.example.padroes.e_builder.ex_1.fluent_builder.builder.FastFoodMealBuilder;
import com.example.padroes.e_builder.ex_1.fluent_builder.model.FastFoodMeal;

public class Client {
    public static void main(String[] args) {
        FastFoodMeal burguerCombo = new FastFoodMealBuilder("Fries")
                .andMain("CheeseBurger")
                .forDrink("Coke")
                .thatsAll();
        System.out.println(burguerCombo);

        FastFoodMeal justFries = new FastFoodMealBuilder("Fries").thatsAll();
        System.out.println(justFries);

        FastFoodMeal heartAtackCombo = new FastFoodMealBuilder("Large Fries")
                .andMain("Monster Burguer")
                .forDrink("Milk Shake")
                .andDessert("Fudge Cake")
                .andGift("2 Kilograms")
                .thatsAll();
        System.out.println(heartAtackCombo);

        FastFoodMeal own = new FastFoodMealBuilder("fried banana")
                .andGift("bullet")
                .andDessert("ice cream")
                .thatsAll();

        System.out.println(own);

    }
}
