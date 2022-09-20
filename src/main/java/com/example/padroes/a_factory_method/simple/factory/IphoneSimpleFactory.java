package com.example.padroes.a_factory_method.simple.factory;

import com.example.padroes.a_factory_method.simple.model.Enum.ModelIphone;
import com.example.padroes.a_factory_method.simple.model.Enum.TypeIphone;
import com.example.padroes.a_factory_method.simple.model.IPhone11Pro_S;
import com.example.padroes.a_factory_method.simple.model.IPhone11_S;
import com.example.padroes.a_factory_method.simple.model.IPhoneXSMax_S;
import com.example.padroes.a_factory_method.simple.model.IPhoneX_S;
import com.example.padroes.a_factory_method.simple.model.modelAbstract.Iphone_S;

public class IphoneSimpleFactory {

    public static Iphone_S orderIphone( ModelIphone modelo, TypeIphone tipo){
        Iphone_S iphoneBuild = null;

        if(modelo == null || tipo == null){
            throw new IllegalArgumentException("Parametros do Iphone Invalido");
        }

        if(modelo.equals(ModelIphone.X)){

            if (tipo.equals(TypeIphone.STANDARD)){
                iphoneBuild = new IPhoneX_S();
            }else if (tipo.equals(TypeIphone.HIGHEND)){
                iphoneBuild = new IPhoneXSMax_S();
            }else{
                throw new IllegalArgumentException("Tipo de Iphone invalido");
            }

        }else if(modelo.equals(ModelIphone.ONZE)){

            if (tipo.equals(TypeIphone.STANDARD)){
                iphoneBuild = new IPhone11_S();
            }else if (tipo.equals(TypeIphone.HIGHEND)){
                iphoneBuild = new IPhone11Pro_S();
            }else{
                throw new IllegalArgumentException("Tipo de Iphone invalido");
            }
        }else{
            throw new IllegalArgumentException(" MODELO de Iphone invalido");
        }

        iphoneBuild.getHardware();
        iphoneBuild.assemble();
        iphoneBuild.certificates();
        iphoneBuild.pack();

        return iphoneBuild;
    }
}
