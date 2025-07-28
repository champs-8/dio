package com.champs.singleton;

/**
 * Singleton "preguiçoso" (Lazy Singleton)
 * @author champs-8
 */

public class SingletonLazy {
    private static SingletonLazy instance; // Instância única, inicializada como null

    private SingletonLazy() {
        // Construtor privado para evitar instanciamento externo
    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton Lazy Instance: " + this);
    }
    public static void main(String[] args) {
        SingletonLazy singleton = SingletonLazy.getInstance();
        singleton.showMessage();
    }
}
