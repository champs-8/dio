package com.champs.properties_value.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SistemaMensagem implements CommandLineRunner {

    //atributos
    //valores vindos do arquivo application.properties

    /*
    @Value("${name:Noreaply-Irineu}") // valor padrão caso não seja definido
    private String name;
    @Value("${email}")
    private String email;
    @Value("${phones}")
    private List<Integer> phones;
    */

    @Autowired
    private Remetente remetente;

    @Override
    public void run(String... args) throws Exception {
        System.out.printf("Mensagem enviada para %s%nEmail: %s%nTelefone: %s",
                remetente.getName(),
                remetente.getEmail(),
                remetente.getPhones());
        System.out.println("\nSeu cadastro foi realizado com sucesso!");
    }
}
