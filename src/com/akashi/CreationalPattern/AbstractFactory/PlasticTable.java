package com.akashi.CreationalPattern.AbstractFactory;

public class PlasticTable implements Table{

    @Override
    public void create() {
        System.out.println("Create plastic table");
    }
}
