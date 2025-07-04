package com.champs.iphone.device;

import com.champs.iphone.interfaces.Aparelho;
import com.champs.iphone.interfaces.Navegador;
import com.champs.iphone.interfaces.Reprodutor;

public class Iphone2007 implements Aparelho, Reprodutor, Navegador{


    // ---- chamadas ----
    @Override
    public void atender(String numero) {
        System.out.println("Atendendo a chamada do número: " + numero);
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    // ---- reprodutor ----
    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
        
    }

    @Override
    public void tocar(String musica) {
        System.out.println("Tocando a música: " + musica);
    }
    
    // ---- navegador ----
    @Override
    public void adicionarAba(String url) {
        System.out.println("Adicionando nova aba com a URL: " + url);
    }

    @Override
    public void adicionarAba() {
        System.out.println("Adicionando nova aba em Branco.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página com a URL: " + url);
    }
    
}
