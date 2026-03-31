package com.curso.validados;

import com.curso.validados.models.Person;
import com.curso.validados.services.PersonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ValidadosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValidadosApplication.class, args);

		testador();
	}

	// ========== Test zone ==========

	private static PersonService personService;

	public ValidadosApplication(PersonService personService) {
		this.personService = personService;
	}

	public static void testador(){

		Person personA = new Person("11111111111", "Maria", 12, "Jorge@Matheus.com");
		personService.create(personA);


	}
	// ========== Test zone ==========
}
