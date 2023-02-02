package com.example.padroes.e_builder.ex_1.default_builder.app;

import com.example.padroes.e_builder.ex_1.default_builder.builder.FatMealBuilder;
import com.example.padroes.e_builder.ex_1.default_builder.builder.JustFriesBuilder;
import com.example.padroes.e_builder.ex_1.default_builder.builder.Menu1Builder;
import com.example.padroes.e_builder.ex_1.default_builder.builder.Menu2Builder;
import com.example.padroes.e_builder.ex_1.default_builder.builder.abstractClass.FastFoodMealBuilder;
import com.example.padroes.e_builder.ex_1.default_builder.director.MealDirector;

public class Client {

	public static void order(String name, FastFoodMealBuilder builder) {
		System.out.println("Ordering a " + name);
		MealDirector director = new MealDirector(builder);
		director.constructCombo();
		System.out.println(director.getCombo());

		System.out.println("------------------");
	}

	public static void main(String[] args) {
		order("Burguer", new Menu1Builder());
		order("Veggie Burguer", new Menu2Builder());
		order("Just Fries", new JustFriesBuilder());
		order("Heart Atack", new FatMealBuilder());
	}
}