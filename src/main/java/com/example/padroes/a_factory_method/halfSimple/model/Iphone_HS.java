package com.example.padroes.a_factory_method.halfSimple.model;

/** @@Entity-Basic */
public abstract class Iphone_HS {

    public abstract void getHardware();

    public void assemble() {
        System.out.println("Assembling all the hardwares");
    }

    public void certificates() {
        System.out.println("Testing all the certificates");
    }

    public void pack() {
        System.out.println("Packing the device");
    }
}
