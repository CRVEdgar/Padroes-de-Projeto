package com.example.padroes.a_factory_method.simple.model;

import com.example.padroes.a_factory_method.simple.model.modelAbstract.Iphone_S;

public class IPhone11_S extends Iphone_S {
    @Override
    public void getHardware() {
        System.out.println("Hardware list");
        System.out.println("\t- 6.1in Screen");
        System.out.println("\t- A13 Chipset");
        System.out.println("\t- 4Gb RAM");
        System.out.println("\t- 256Gb Memory");
    }
}
