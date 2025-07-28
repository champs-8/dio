package com.champs.singleton;

/**
 * Singleton "apressado" (eager Singleton)
 * @author champs-8
 */

public class SingletonEager {

    private static final SingletonEager instance = new SingletonEager();
    // Instância única, inicializada no momento da classe ser carregada

    private SingletonEager() {
        // Construtor privado para evitar instanciamento externo
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
