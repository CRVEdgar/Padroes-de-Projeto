package com.example.padroes.a_factory_method.default_factory.factory.abstractFactory;

import com.example.padroes.a_factory_method.default_factory.model.Iphone;

/** Factory default - abstract - to extends */
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
