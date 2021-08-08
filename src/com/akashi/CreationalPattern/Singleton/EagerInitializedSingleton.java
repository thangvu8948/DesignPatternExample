package com.akashi.CreationalPattern.Singleton;
/*
This type of singleton will create instance when its called in the first time
 */
public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();
    private EagerInitializedSingleton() {

    }
    public static EagerInitializedSingleton getInstance() {
        return INSTANCE;
    }
}
