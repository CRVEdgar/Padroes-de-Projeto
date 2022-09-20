package com.example.padroes.a_factory_method.halfSimple.factory.abstractFactory;


import com.example.padroes.a_factory_method.halfSimple.model.Iphone_HS;

/** Factory default - abstract - to extends */
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
