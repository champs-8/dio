package com.champs.facade;

import com.champs.facade.subsistema_crm.CrmService;
import com.champs.facade.subsistemas2_cep.CepAPI;

public class Facade {
    public void migrarCliente(String name, String cep){
        String cidade = CepAPI.getInstance().recuperarCidade(cep);
        String estade = CepAPI.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(name, cep, cidade, estade);
    }
}
