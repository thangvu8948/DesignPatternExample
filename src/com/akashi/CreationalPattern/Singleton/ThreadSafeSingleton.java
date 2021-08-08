package com.akashi.CreationalPattern.Singleton;
/*
Cons: synchronized method is slow and not performance
 */
public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton INSTANCE;
    private ThreadSafeSingleton() {}
    public static synchronized ThreadSafeSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ThreadSafeSingleton();
        }
        return INSTANCE;
    }
}
