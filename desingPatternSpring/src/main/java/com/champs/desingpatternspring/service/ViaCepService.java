package com.champs.desingpatternspring.service;

import com.champs.desingpatternspring.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "viaCep", url = "https://viacep.com.br/ws")
// This interface is used to define the ViaCep service for fetching address information
public interface ViaCepService {
    @GetMapping("/{cep}/json/")
    Endereco consultaCep(@PathVariable("cep") String cep);
}
