package com.example.padroes.a_factory_method.halfSimple.factory;


import com.example.padroes.a_factory_method.halfSimple.model.Iphone_HS;

public abstract class IphoneFactory_HS {

    public Iphone_HS orderIphone(String level){
        Iphone_HS device = null;

        device = createIphone(level);

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    protected abstract Iphone_HS createIphone(String level);
}
