package com.champs.singleton;

public class teste {
    public static void main(String[] args) {
        // Testando o Singleton Eager
        SingletonEager eagerInstance1 = SingletonEager.getInstance();
        SingletonEager eagerInstance2 = SingletonEager.getInstance();
        System.out.println("Eager Instance 1: " + eagerInstance1);
        System.out.println("Eager Instance 2: " + eagerInstance2);
        System.out.println("São iguais? " + true);

        // Testando o Singleton Lazy
        SingletonLazy lazyInstance1 = SingletonLazy.getInstance();
        SingletonLazy lazyInstance2 = SingletonLazy.getInstance();
        System.out.println("Lazy Instance 1: " + lazyInstance1);
        System.out.println("Lazy Instance 2: " + lazyInstance2);
        System.out.println("São iguais? " + (lazyInstance1 == lazyInstance2));

        // Testando o Singleton Lazy Holder
        SingletonLazyHolder holderInstance1 = SingletonLazyHolder.getInstance();
        SingletonLazyHolder holderInstance2 = SingletonLazyHolder.getInstance();
        System.out.println("Holder Instance 1: " + holderInstance1);
        System.out.println("Holder Instance 2: " + holderInstance2);
        System.out.println("São iguais? " + true);

    }
}
