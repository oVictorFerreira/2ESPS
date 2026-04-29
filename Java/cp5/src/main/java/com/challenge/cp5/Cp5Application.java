package com.challenge.cp5;

import com.challenge.cp5.services.FeriadoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Cp5Application {

	public static void main(String[] args) {
		SpringApplication.run(Cp5Application.class, args);
		testador();
	}

	// =============== Zona de Teste ===============
	private static FeriadoService feriadoService;

	public Cp5Application(FeriadoService feriadoService) {
		this.feriadoService = feriadoService;
	}

	private static void testador() {
		feriadoService.buscarPorAno(2025);
	}
	// Erick Cardoso RM: 560440
	// Gabrielly Candido RM: 560916
	// João Victor Ferreira RM: 560439
	// Luiza Ribeiro RM: 560200
	// =============== Zona de Teste ===============

}
