package com.example.padroes.a_factory_method.halfSimple.model;

public class IPhoneXSMax_HS extends Iphone_HS {

	@Override
	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("\t- 6.5in Screen");
		System.out.println("\t- A12 Chipset");
		System.out.println("\t- 4Gb RAM");
		System.out.println("\t- 512Gb Memory");
	}
}
