package com.example.padroes.a_factory_method.halfSimple.factory;

import com.example.padroes.a_factory_method.halfSimple.model.IPhone11_HS;
import com.example.padroes.a_factory_method.halfSimple.model.IPhone11Pro_HS;
import com.example.padroes.a_factory_method.halfSimple.model.Iphone_HS;

public class Iphone11Facotory_HSHS extends IphoneFactory_HS {
    @Override
    protected Iphone_HS createIphone(String level) {

        if(level.equals("standard")) {
            return new IPhone11_HS();
        }else if(level.equals("highEnd")){
            return new IPhone11Pro_HS();
        }
        return null;
    }
}
