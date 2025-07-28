package com.champs.facade.subsistemas2_cep;

public class CepAPI {
    private final static CepAPI instance = new CepAPI();

    private CepAPI(){
        // private constructor to prevent instantiation
    }

    public static CepAPI getInstance(){
        return instance;
    }

    public String recuperarCidade(String cep){
      return "Montes Claros";
    }
    public String recuperarEstado(String cep){
        return "MG";
    }
}
