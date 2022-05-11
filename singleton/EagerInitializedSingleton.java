package com.dp.singleton;

public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton(){};

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }

    public void show(){
        System.out.println("Im a Eager Singelton");
    }

}
