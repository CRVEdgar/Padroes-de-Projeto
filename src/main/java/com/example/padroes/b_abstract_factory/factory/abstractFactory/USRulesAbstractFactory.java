package com.example.padroes.b_abstract_factory.factory.abstractFactory;

import com.example.padroes.b_abstract_factory.model.certificate.Certificate;
import com.example.padroes.b_abstract_factory.model.certificate.USCertificate;
import com.example.padroes.b_abstract_factory.model.packing.Packing;
import com.example.padroes.b_abstract_factory.model.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory{
    @Override
    public Certificate getCertificates() {
        return new USCertificate();
    }

    @Override
    public Packing getPacking() {
        return new USPacking();
    }
}
