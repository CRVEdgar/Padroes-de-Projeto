package com.example.padroes.a_factory_method.simple.model;

import com.example.padroes.a_factory_method.simple.model.modelAbstract.Iphone_S;

public class IPhoneX_S extends Iphone_S {

	@Override
	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("\t- 5.8in Screen");
		System.out.println("\t- A11 Chipset");
		System.out.println("\t- 3Gb RAM");
		System.out.println("\t- 256Gb Memory");
	}
}
