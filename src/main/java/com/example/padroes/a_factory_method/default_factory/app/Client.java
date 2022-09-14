package com.example.padroes.a_factory_method.default_factory.app;

import com.example.padroes.a_factory_method.default_factory.factory.*;
import com.example.padroes.a_factory_method.default_factory.model.Iphone;

public abstract class Client {
    public static void main(String[] args) {

        /** A classe Abstrata IphoneFactory e instancada a partir das fabricas que a extendem*/
        IphoneFactory iphoneXFactory = new IphoneXFactory();
        IphoneFactory iphone11ProFactory = new Iphone11ProFactory();
        IphoneFactory iphone11Factory = new Iphone11Factory();
        IphoneFactory iphoneXSMaxFactory = new IphoneXSMaxFactory();


        System.out.println("### Ordering an iPhone X");
        Iphone iphoneX = iphoneXFactory.orderIphone();
        System.out.println(iphoneX);

        System.out.println("\n\n ### Ordering an Iphone 11 Pro");
        Iphone iphone11Pro = iphone11ProFactory.orderIphone();
        System.out.println(iphone11Pro);

        System.out.println("\n\n ### Ordering an Iphone 11");
        Iphone iphone11 = iphone11Factory.orderIphone();
        System.out.println(iphone11);

        System.out.println("\n\n ### Ordering an Iphone 11 XSMAX");
        Iphone iphoneXSMax = iphoneXSMaxFactory.orderIphone();
        System.out.println(iphoneXSMax);
    }
}
