package com.example.padroes.b_abstract_factory.factory.abstractFactory;


import com.example.padroes.b_abstract_factory.model.certificate.Certificate;
import com.example.padroes.b_abstract_factory.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
