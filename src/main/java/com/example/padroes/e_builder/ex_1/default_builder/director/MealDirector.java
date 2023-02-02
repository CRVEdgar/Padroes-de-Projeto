package com.example.padroes.e_builder.ex_1.default_builder.director;


import com.example.padroes.e_builder.ex_1.default_builder.builder.abstractClass.FastFoodMealBuilder;
import com.example.padroes.e_builder.ex_1.default_builder.model.FastFoodMeal;

public class MealDirector {

	private FastFoodMealBuilder builder;

	public MealDirector(FastFoodMealBuilder builder) {
		this.builder = builder;
	}
	
	public void constructCombo() {
		builder.buildDrink();
		builder.buildMain();
		builder.buildSide();
		builder.buildDessert();
		builder.buildGift();
	}
	
	public FastFoodMeal getCombo() {
		return builder.getMeal();
	}
}
