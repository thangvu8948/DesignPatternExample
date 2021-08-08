package com.akashi.CreationalPattern.AbstractFactory;

public class WoodTable implements Table {
    @Override
    public void create() {
        System.out.println("Create wood table");
    }
}
