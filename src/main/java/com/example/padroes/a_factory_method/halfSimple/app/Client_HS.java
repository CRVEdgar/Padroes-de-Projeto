package com.example.padroes.a_factory_method.halfSimple.app;

import com.example.padroes.a_factory_method.halfSimple.factory.Iphone11Facotory_HSHS;
import com.example.padroes.a_factory_method.halfSimple.factory.IphoneFactory_HS;
import com.example.padroes.a_factory_method.halfSimple.factory.IphoneXFactoryHS;
import com.example.padroes.a_factory_method.halfSimple.model.Iphone_HS;

public abstract class Client_HS {

    public static void main(String[] args) {
        IphoneFactory_HS genXFactory =  new IphoneXFactoryHS();
        IphoneFactory_HS gen11Factory =  new Iphone11Facotory_HSHS();

        System.out.println("### Ordering an iPhone X");
        Iphone_HS xFactory = genXFactory.orderIphone("standard");
        xFactory.getHardware();
        System.out.println(xFactory);

        System.out.println("\n\n ### Ordering an Iphone 11 Pro");
        Iphone_HS _11Factory = genXFactory.orderIphone("highEnd");
        _11Factory.getHardware();
        System.out.println(_11Factory);
    }
}
