package com.champs.facade.subsistema_crm;

public class CrmService {
    private CrmService(){
        super();
    }

    public static void gravarCliente(String name, String cep,String cidade, String estado){
        System.out.println("Cliente salvo no sistema de CRM");
        System.out.println("Nome: " + name);
        System.out.println("CEP: " + cep);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
    }
}
