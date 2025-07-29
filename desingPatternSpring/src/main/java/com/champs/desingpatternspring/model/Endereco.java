package com.champs.desingpatternspring.model;

/**
 * Os atributos desse modelo foram definidos de acordo com a documentação da API ViaCEP.
 *
 * @see <a href="https://viacep.com.br/">ViaCEP</a>
 * @see <a herf = "https://www.jsonschema2pojo.org/">JSON Schema to POJO</a>
 *
 * @author champs-8
 */


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Endereco {
    @Id
    private String cep;
    private String logradouro;
    private String bairro;
    private String complemento;
    private String localidade;
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;
}
