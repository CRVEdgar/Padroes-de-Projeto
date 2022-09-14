package com.example.padroes.a_factory_method.default_factory.factory;

import com.example.padroes.a_factory_method.default_factory.model.Iphone;

public abstract class IphoneFactory {

    public Iphone orderIphone(){
        Iphone device = null;

        device = createIphone();

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    protected abstract Iphone createIphone();

}
