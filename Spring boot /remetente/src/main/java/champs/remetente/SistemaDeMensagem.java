package champs.remetente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaDeMensagem {
    @Autowired
    private Remetente noreply;
    @Autowired
    private Remetente techTeam;

    public void enviarConfirmacaoCadastro(){
        System.out.println(noreply);
        System.out.println("Seu cadastro foi realizado com sucesso!");
    }

    public void enviarMensagemBoasVindas(){
        techTeam.setEmail("tech@champs");
        System.out.println(techTeam);
        System.out.println("Bem-vindo ao time CHAMPS!");
    }
}
