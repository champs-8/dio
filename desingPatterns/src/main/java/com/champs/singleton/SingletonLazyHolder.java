package com.champs.singleton;

/**
 * Singleton "preguiçoso" com Holder (Lazy Holder Singleton)
 * Este padrão utiliza uma classe interna estática para manter a instância única.
 * A instância é criada apenas quando o método getInstance é chamado pela primeira vez,
 * garantindo que a inicialização ocorra de forma preguiçosa e segura.
 * @author champs-8
 */

public class SingletonLazyHolder {

    private static class instanceHolder{
        // Classe interna estática que contém a instância única
        // A instância é criada quando a classe é carregada, mas não antes
        public static final SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        // Construtor privado para evitar instanciamento externo
    }

    public static SingletonLazyHolder getInstance() {
        return instanceHolder.instance;
    }
}
