package com.champs.desingpatternspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring boot gerado via Spring Initializr
 * Os seguintes módulos foram adicionados:
 * - Spring Web
 * - Spring Boot DevTools
 * - OpenFeign
 * - H2 Database
 * - Lombok
 * - JPA
 *
 *  @author champs-8
 */

@SpringBootApplication
@EnableFeignClients
public class DesingpatternspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesingpatternspringApplication.class, args);
		System.out.println("===========\nSpring ativo!\n===========");
		System.out.println("Acesse o H2 Database em: http://localhost:8080/h2-console");
	}

}
