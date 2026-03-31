package com.curso.validados.services;

import com.curso.validados.models.Person;
import com.curso.validados.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {
    // Injetar DP

    @Autowired
    private PersonRepository personRepository;

    // Metod0 para listar todas as pessoas

    public List<Person> listAllPerson(){
       List<Person> allPerson = new ArrayList<>();

       personRepository.findAll().forEach(person -> {
           allPerson.add(person);
           System.out.println(person);
       });

       return allPerson;
    }

    // Metod0 para criar novo registro de pessoa

    public Person create(Person person){
        try{
            personRepository.save(person);
            System.out.println("Registro criado com sucesso.");
        }

        catch(Exception exception){
            System.out.println(exception);
        }

        return person;
    }
}
