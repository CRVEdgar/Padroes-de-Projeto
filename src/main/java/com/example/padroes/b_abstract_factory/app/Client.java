package com.example.padroes.b_abstract_factory.app;

import com.example.padroes.b_abstract_factory.factory.Iphone11Factory;
import com.example.padroes.b_abstract_factory.factory.IphoneFactory;
import com.example.padroes.b_abstract_factory.factory.IphoneXFactory;
import com.example.padroes.b_abstract_factory.factory.abstractFactory.BrazilianRulesAbstractFactory;
import com.example.padroes.b_abstract_factory.factory.abstractFactory.CountryRulesAbstractFactory;
import com.example.padroes.b_abstract_factory.factory.abstractFactory.USRulesAbstractFactory;

public class Client {
    public static void main(String[] args) {
        CountryRulesAbstractFactory rulesBR = new BrazilianRulesAbstractFactory();
        IphoneFactory factoryIphone11BR = new Iphone11Factory(rulesBR);
        IphoneFactory factoryIphoneXBR = new IphoneXFactory(rulesBR);

        try{
            System.out.println("### Criando Iphone 11 - versão Brasileira");
            factoryIphone11BR.orderIphone("standard");
            factoryIphone11BR.orderIphone("highEnd");

            System.out.println("### Criando Iphone X - versão Brasileira");
            factoryIphoneXBR.orderIphone("highEnd");
            factoryIphoneXBR.orderIphone("standard");


        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }


        CountryRulesAbstractFactory rulesUS = new USRulesAbstractFactory();
        IphoneFactory factoryIphone11US = new Iphone11Factory(rulesUS);
        IphoneFactory factoryIphoneXUS = new IphoneXFactory(rulesUS);

        System.out.println("\n\n ### Criando Iphone 11 - versão Americana");
        factoryIphone11US.orderIphone("standard");
        factoryIphone11US.orderIphone("highEnd");

        System.out.println("### Criando Iphone X - versão Americana");
        factoryIphoneXUS.orderIphone("highEnd");
        factoryIphoneXUS.orderIphone("standard");
    }
}
