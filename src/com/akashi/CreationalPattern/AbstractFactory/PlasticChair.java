package com.akashi.CreationalPattern.AbstractFactory;

public class PlasticChair implements Chair{
    @Override
    public void create() {
        System.out.println("Create plastic chair");
    }
}
