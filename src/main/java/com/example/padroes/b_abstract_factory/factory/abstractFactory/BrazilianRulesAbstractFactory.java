package com.example.padroes.b_abstract_factory.factory.abstractFactory;

import com.example.padroes.b_abstract_factory.model.certificate.BrazilianCertificate;
import com.example.padroes.b_abstract_factory.model.certificate.Certificate;
import com.example.padroes.b_abstract_factory.model.packing.BrazilianPacking;
import com.example.padroes.b_abstract_factory.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory{
    @Override
    public Certificate getCertificates() {
        return new BrazilianCertificate();
    }

    @Override
    public Packing getPacking() {
        return new BrazilianPacking();
    }
}
