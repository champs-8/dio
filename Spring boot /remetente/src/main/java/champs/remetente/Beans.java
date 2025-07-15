package champs.remetente;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {
    @Bean
    // Define o escopo como prototype para criar uma nova instância a cada chamada
    @Scope("prototype")
    public Remetente remetente(){
        System.out.println("CRIANDO OBJETO REMETENTE");
        Remetente remetente = new Remetente();
        remetente.setEmail("noreply@champs");
        remetente.setName("Digital Innovation One");
        return remetente;
    }
}
