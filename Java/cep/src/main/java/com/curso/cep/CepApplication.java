package com.curso.cep;

import com.curso.cep.services.CepService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CepApplication {

	public static void main(String[] args) {
		SpringApplication.run(CepApplication.class, args);

        testador();
	}

    // =============== Zona de Teste ===============
    private static CepService cepService;

    public CepApplication(CepService cepService) {
        this.cepService = cepService;
    }

    private static void testador() {
        cepService.getByCep("03906050");
    }

    // =============== Zona de Teste ===============
}
