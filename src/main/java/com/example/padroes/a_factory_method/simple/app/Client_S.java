package com.example.padroes.a_factory_method.simple.app;

import com.example.padroes.a_factory_method.simple.factory.IphoneSimpleFactory;
import com.example.padroes.a_factory_method.simple.model.Enum.ModelIphone;
import com.example.padroes.a_factory_method.simple.model.Enum.TypeIphone;
import com.example.padroes.a_factory_method.simple.model.modelAbstract.Iphone_S;

public class Client_S {

    public static void main(String[] args) {
        System.out.println("### Ordering an iPhone X");
        Iphone_S iphoneBuild_X = IphoneSimpleFactory.orderIphone( ModelIphone.X , TypeIphone.STANDARD);
        System.out.println(iphoneBuild_X);

        Iphone_S iphoneBuild_XH = IphoneSimpleFactory.orderIphone( ModelIphone.X , TypeIphone.HIGHEND);
        System.out.println(iphoneBuild_XH);

        System.out.println("\n\n ### Ordering an Iphone 11 Pro");
        Iphone_S iphoneBuild_Onze = IphoneSimpleFactory.orderIphone( ModelIphone.ONZE, TypeIphone.HIGHEND );
        System.out.println(iphoneBuild_Onze);

        Iphone_S iphoneBuild_OnzeStd = IphoneSimpleFactory.orderIphone( ModelIphone.ONZE, TypeIphone.STANDARD );
        System.out.println(iphoneBuild_OnzeStd);

    }
}
