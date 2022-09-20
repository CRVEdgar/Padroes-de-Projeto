package com.example.padroes.a_factory_method.halfSimple.app;

import com.example.padroes.a_factory_method.halfSimple.factory.Iphone11Factory_HS;
import com.example.padroes.a_factory_method.halfSimple.factory.abstractFactory.IphoneFactory_HS;
import com.example.padroes.a_factory_method.halfSimple.factory.IphoneXFactory_HS;
import com.example.padroes.a_factory_method.halfSimple.model.Iphone_HS;

public abstract class Client_HS {

    public static void main(String[] args) {
        IphoneFactory_HS genXFactory =  new IphoneXFactory_HS();
        IphoneFactory_HS gen11Factory =  new Iphone11Factory_HS();

        System.out.println("### Ordering an iPhone X");
        Iphone_HS xFactory = genXFactory.orderIphone("standard");
        System.out.println(xFactory.getClass());

        System.out.println("\n\n ### Ordering an Iphone 11 Pro");
        Iphone_HS _11Factory = gen11Factory.orderIphone("highEnd");
        System.out.println(_11Factory);
    }
}
