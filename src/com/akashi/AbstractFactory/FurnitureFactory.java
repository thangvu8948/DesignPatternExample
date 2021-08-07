package com.akashi.AbstractFactory;

public class FurnitureFactory {
    private FurnitureFactory() {

    }

    public static FurnitureAbstractFactory getFactory(MaterialType type) {
        switch (type) {
            case PLASTIC:
                return new PlasticFactory();
            case WOOD:
                return new WoodFactory();
            default: throw new IllegalArgumentException("Factory is not defined");
        }
    }
}
