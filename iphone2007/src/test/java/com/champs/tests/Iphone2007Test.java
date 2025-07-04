package com.champs.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.champs.iphone.device.Iphone2007;

//Classe de teste para classe Iphone2007
public class Iphone2007Test {
    //armazena as saídas do console (System.out)
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    //armazena o System.out original para restaurar depois
    private final PrintStream originalOut = System.out;

    private Iphone2007 iphone;

    /**
     * Executa antes de cada teste.
     * Aqui, redirecionamos o System.out para capturar as mensagens.
     */

    @BeforeEach
    void setup(){
        iphone = new Iphone2007(); //cria uma nova instancia para cada teste.
        System.setOut(new PrintStream(output)); //Redireciona a saida para o output
    }

    /**
     * Executa depois de cada teste.
     * Aqui restauramos o System.out original.
     */

    @AfterEach
    void tearDown(){
        System.setOut(originalOut); //restaura a saída padrão
    }

    /**
    * Testa se o método ligar(String) imprime corretamente a mensagem no console.
    */
    @Test
    void testLigarNumero(){
        iphone.ligar("4002-8922");
        //verifica se a saída tem a resposta esperada
        assertTrue(output.toString().contains("Ligando para o número: 4002-8922"));
    }

    /**
    * Testa o método selecionarMusica(String).
    */
    @Test
    void testSelecionarMusica() {
        iphone.selecionarMusica("Visão tá Ouro - TdP");
        assertTrue(output.toString().contains("Selecionando a música: Visão tá Ouro - TdP"));
    }

    /**
     * Testa se o método exibirPagina(String) está imprimindo corretamente.
     */
    @Test
    void testExibirPagina() {
        iphone.exibirPagina("www.apple.com");
        assertTrue(output.toString().contains("Exibindo página com a URL: www.apple.com"));
    }
}
