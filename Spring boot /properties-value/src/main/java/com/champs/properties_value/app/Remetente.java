package com.champs.properties_value.app;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
// Indica que esta classe é uma configuração do Spring
@Configuration
// Indica que os valores desta classe serão preenchidos
// a partir do arquivo application.properties
@ConfigurationProperties(prefix = "remetente")
@Data
public class Remetente {
    private String name;
    private String email;
    private List<Integer> phones;
}
