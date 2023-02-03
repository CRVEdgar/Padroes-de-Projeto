package com.example.padroes.e_builder.ex_1.functional_builder.app;

import com.example.padroes.e_builder.ex_1.functional_builder.model.FastFoodMeal;

public class Client {
    public static void main(String[] args) {
        FastFoodMeal burguerCombo = new FastFoodMeal.Builder("Fries")
                .andMain("CheeseBurger")
                .forDrink("Code")
                .thatsAll();
        System.out.println(burguerCombo);

        FastFoodMeal justFries = new FastFoodMeal.Builder("Fries").thatsAll();
        System.out.println(justFries);

        FastFoodMeal heartAtackCombo = new FastFoodMeal.Builder("Large Fries")
                .andMain("Monster Burguer")
                .forDrink("Milk Shake")
                .andDessert("Fudge Cake")
                .andGift("2 Kilograms")
                .thatsAll();
        System.out.println(heartAtackCombo);

        FastFoodMeal own = new FastFoodMeal.Builder("Functional method")
                .forDrink("tea")
                .thatsAll();
        System.out.println(own);

    }
}
