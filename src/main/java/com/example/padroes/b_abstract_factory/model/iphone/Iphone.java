package com.example.padroes.b_abstract_factory.model.iphone;

import com.example.padroes.b_abstract_factory.factory.abstractFactory.CountryRulesAbstractFactory;

/** @@Entity-Basic */
public abstract class Iphone {

    CountryRulesAbstractFactory rules;

    public Iphone(CountryRulesAbstractFactory rules) {
        this.rules = rules;
    }

    public abstract void getHardware();

    public void assemble() {
        System.out.println("Assembling all the hardwares");
    }

    public void certificates() {
        System.out.println("Testing all the certificates");
        System.out.println(rules.getCertificates().applyCertification());
    }

    public void pack() {
        System.out.println("Packing the device");
        System.out.println(rules.getPacking().pack());
    }
}
