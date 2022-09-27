package com.example.padroes.b_abstract_factory.factory;

import com.example.padroes.b_abstract_factory.factory.abstractFactory.CountryRulesAbstractFactory;
import com.example.padroes.b_abstract_factory.model.iphone.IPhoneX;
import com.example.padroes.b_abstract_factory.model.iphone.IPhoneXSMax;
import com.example.padroes.b_abstract_factory.model.iphone.Iphone;

public class IphoneXFactory extends IphoneFactory{

    public IphoneXFactory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    protected Iphone createIphone(String level) {

        if(level.equals("standard")){
            return new IPhoneX(rules);
        }else if(level.equals("highEnd")){
            return new IPhoneXSMax(rules);
        }else {
            throw new IllegalArgumentException("tipo de Iphone invalido");
        }

    }
}
