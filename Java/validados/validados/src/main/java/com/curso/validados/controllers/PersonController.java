package com.curso.validados.controllers;

import com.curso.validados.models.Person;
import com.curso.validados.services.PersonService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/persons")
public class PersonController {

    //Injeçao de DPs

    @Autowired
    private PersonService personService;

    // done: Endpoint GET para listar todas as pessoas
    // http://localhost:8080/persons
    @GetMapping
    public ResponseEntity<List<Person>> getAllPerson(){
        return ResponseEntity.ok(personService.listAllPerson());
    }

    // done: Endpoint POST para criar um novo registro de pessoa
    // http://localhost:8080/persons
    // body {"name":"Maria Joaquina", "age":21, "email":"maria@joaquina.com","cpf":"99999999999"}
    @PostMapping
    public ResponseEntity<String> postPerson(@Valid @RequestBody Person person){

        personService.create(person);

        return ResponseEntity.ok("Pessoa criada com sucesso");
    }

    // Mensagens de ExceptionHandler
    // Anotações para tratar mensagens de exceptions
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> handleValidationErrors(MethodArgumentNotValidException exception){
        Map<String, String> errors = new HashMap<>();
        exception.getBindingResult().getFieldErrors().forEach(fieldError -> {
            String field = fieldError.getField();
            String message = fieldError.getDefaultMessage();
            errors.put(field, message);
        });
        return errors;
    }

}
