package com.curso.contatos;

import com.curso.contatos.models.Phone;
import com.curso.contatos.services.PhoneService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContatosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContatosApplication.class, args);

        testador();

	}


    // ============= Test Zone =============
    private static PhoneService phoneService;

    public ContatosApplication(PhoneService phoneService) {
        this.phoneService = phoneService;
    }

    static void testador(){
        // Criando novos registros de telegone

        Phone phoneA = new Phone("Jorge e Matheus", "11-97070-7070");

        Phone phoneB = new Phone("Matheus e Kauan", "11-94002-8922");

        phoneService.insertPhone(phoneA);
    }
}
