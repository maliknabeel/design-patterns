package com.digicl.creationaldesignpatterns.singleton.threadsafe;

public class ThreadSafeSingleton {
    // The field must be declared volatile so that double check lock would work
    // correctly.
    private static volatile ThreadSafeSingleton instance;

    public String value;

    private ThreadSafeSingleton(String value) {
        this.value = value;
    }

    public static ThreadSafeSingleton getInstance(String value) {
        ThreadSafeSingleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized(ThreadSafeSingleton.class) {
            if (instance == null) {
                instance = new ThreadSafeSingleton(value);
            }
            return instance;
        }
    }
}