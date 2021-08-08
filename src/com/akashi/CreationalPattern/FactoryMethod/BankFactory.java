package com.akashi.CreationalPattern.FactoryMethod;

public class BankFactory {
    private BankFactory() {

    }

    public static final Bank getBank(BankType type) {
        switch (type) {
            case TPBANK:
                return new VietComBank();
            case VIETCOMBANK:
                return new TPBank();
            default:
                throw new IllegalArgumentException("This bank type is not defined");
        }
    }
}
