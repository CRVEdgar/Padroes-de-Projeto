package com.example.padroes.b_abstract_factory.factory;

import com.example.padroes.b_abstract_factory.factory.abstractFactory.CountryRulesAbstractFactory;
import com.example.padroes.b_abstract_factory.model.iphone.IPhone11;
import com.example.padroes.b_abstract_factory.model.iphone.IPhone11Pro;
import com.example.padroes.b_abstract_factory.model.iphone.Iphone;

public class Iphone11Factory extends IphoneFactory{

    public Iphone11Factory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    protected Iphone createIphone(String level) {
        if(level.equals("standard")){
            return new IPhone11(rules);
        }else if(level.equals("highEnd")){
            return new IPhone11Pro(rules);
        }else {
            throw new IllegalArgumentException("tipo de Iphone invalido");
        }
    }
}
