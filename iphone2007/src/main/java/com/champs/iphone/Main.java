package com.champs.iphone;

import com.champs.iphone.device.Iphone2007;

public class Main {
    public static void main(String[] args) throws Exception {
        Iphone2007 iphone = new Iphone2007();

        System.out.println("\n-- Chamadas ---\n\n");
        iphone.ligar("123456789");
        iphone.atender("987654321");
        iphone.iniciarCorreioDeVoz();

        System.out.println("\n--- Reprodutor ---\n\n");
        iphone.tocar("Provavelmente - Tribo da Periferia");
        iphone.pausar();
        iphone.selecionarMusica("Carro de Malandro - Duck Jay");

        System.out.println("\n--- Navegação ---\n\n");
        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarAba("https://www.youtube.com");
        iphone.adicionarAba();
        iphone.atualizarPagina();
    }
}
