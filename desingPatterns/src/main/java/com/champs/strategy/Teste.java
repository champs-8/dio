package com.champs.strategy;

public class Teste {
    public static void main(String[] args) {
        Robo robo = new Robo();

        // Comportamento normal
        Comportamento normal = new ComportamentoNormal();
        robo.setStrategy(normal);
        robo.mover();

        // Comportamento defensivo
        Comportamento defensivo = new ComportamentoDefensivo();
        robo.setStrategy(defensivo);
        robo.mover();

        // Comportamento agressivo
        ComportamentoAgressivo agressivo = new ComportamentoAgressivo();
        robo.setStrategy(agressivo);
        robo.mover();
    }
}
