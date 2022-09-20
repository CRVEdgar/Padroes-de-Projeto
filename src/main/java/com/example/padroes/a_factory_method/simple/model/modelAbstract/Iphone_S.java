package com.example.padroes.a_factory_method.simple.model.modelAbstract;

/** @@Entity-Basic */
public abstract class Iphone_S {

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
