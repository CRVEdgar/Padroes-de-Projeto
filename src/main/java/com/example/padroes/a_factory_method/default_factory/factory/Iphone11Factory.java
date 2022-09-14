package com.example.padroes.a_factory_method.default_factory.factory;

import com.example.padroes.a_factory_method.default_factory.model.IPhone11;
import com.example.padroes.a_factory_method.default_factory.model.Iphone;

/** As classes concretas devem extender as fabricas abstratas e implementar seus metodos */
public class Iphone11Factory extends IphoneFactory{
    @Override
    protected Iphone createIphone() {
        return new IPhone11();
    }
}
