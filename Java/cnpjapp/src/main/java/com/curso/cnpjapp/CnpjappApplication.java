package com.curso.cnpjapp;

import com.curso.cnpjapp.services.CnpjService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CnpjappApplication {

	public static void main(String[] args) {
		SpringApplication.run(CnpjappApplication.class, args);

		testador();
	}

	//Zona de teste
	private static CnpjService cnpjService;

	public CnpjappApplication(CnpjService cnpjService) {
		this.cnpjService = cnpjService;
	}

	static void testador(){

		cnpjService.consultar("33.683.111/0002-80");
	}

	// Erick Cardoso - RM 560440
	// Gabrielly Candido - RM 560916
	// João Victor Ferreira - RM 560439
	// Luiza Saraçol - RM 560200

}
