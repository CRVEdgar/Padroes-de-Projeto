package com.example.padroes.b_abstract_factory.factory;

import com.example.padroes.b_abstract_factory.factory.abstractFactory.CountryRulesAbstractFactory;
import com.example.padroes.b_abstract_factory.model.iphone.Iphone;

public abstract class IphoneFactory {

    CountryRulesAbstractFactory rules;

    public IphoneFactory(CountryRulesAbstractFactory rules) {
        this.rules = rules;
    }

    public Iphone orderIphone(String level){
         Iphone device = null;

         device = createIphone(level);

         device.getHardware();
         device.assemble();
         device.certificates();
         device.pack();

         return device;
    }

    protected abstract Iphone createIphone(String level);
}
