package champs.remetente;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RemetenteApplication {

	public static void main(String[] args) {
		SpringApplication.run(RemetenteApplication.class, args);
	}
	@Bean
	public CommandLineRunner run(SistemaDeMensagem sistema) throws Exception {
		return args -> {;
			sistema.enviarConfirmacaoCadastro();
			sistema.enviarMensagemBoasVindas();
			sistema.enviarConfirmacaoCadastro();
		};
	}
}
