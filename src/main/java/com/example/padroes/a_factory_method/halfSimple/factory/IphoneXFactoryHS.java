package com.example.padroes.a_factory_method.halfSimple.factory;

import com.example.padroes.a_factory_method.halfSimple.model.IPhoneX_HS;
import com.example.padroes.a_factory_method.halfSimple.model.IPhoneXSMax_HS;
import com.example.padroes.a_factory_method.halfSimple.model.Iphone_HS;

public class IphoneXFactoryHS extends IphoneFactory_HS {
    @Override
    protected Iphone_HS createIphone(String level) {

        if(level.equals("standard")){
            return new IPhoneX_HS();
        }else if(level.equals("highEnd")){
            return new IPhoneXSMax_HS();
        }
        return null;
    }
}
