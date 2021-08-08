package com.akashi.CreationalPattern.Singleton;

public class StaticBlockSingleton {
    private static final StaticBlockSingleton INSTANCE;
    private StaticBlockSingleton() {

    }
    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Execption occured in creating instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }
}
