package com.curso.GS2026.controllers;

import com.curso.GS2026.models.Country;
import com.curso.GS2026.models.OperationalRole;
import com.curso.GS2026.models.Operator;
import com.curso.GS2026.services.OperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Indica controllers com endpoint JSON
@RequestMapping("/api/operators") // Endpoint raiz dos operadores dos satelites.

public class OperatorController {

    // Done: Injeção de DPs
    @Autowired
    private OperatorService operatorService;

    // Done: Metodo GET - Listar todos os operadores de satélite
    //Endpoint: http://localhost:8080/api/operators

    @GetMapping
    public List<Operator> getAllOperators(){
        return operatorService.allOperators();
    }

    // Done: Metodo GET - Listar operador por role
    //Endpoint: http://localhost:8080/api/operators/role/{role}
    @GetMapping("/role/{role}")
    public List<Operator> getOperatorsByRole(@PathVariable OperationalRole role){
        return operatorService.listOperatorByRole(role);
    }

    // Done: Metodo GET - Listar operador contendo um fragmento do nome
    //Endpoint: http://localhost:8080/api/operators/name/{opNameFragment}
    @GetMapping("/name/{opNameFragment}")
    public List<Operator> getOperatorByNameFragment(@PathVariable String opNameFragment){
        return operatorService.findByOpNameContaining(opNameFragment);
    }

    // Done: Metodo GET - Listar operadores entre paises
    //Endpoint: http://localhost:8080/api/operators/country/{country}
    @GetMapping("/country/{country}")
    public List<Operator> getOperatorByCountry(@PathVariable Country country){
        return operatorService.listByCountry(country);
    }

    // Done: Metodo GET - Buscar operador por id
    //Endpoint: http://localhost:8080/api/operators/id/{operatorId}
    @GetMapping("/id/{operatorId}")
    public Operator getOperatorById(@PathVariable Integer operatorId){
        return operatorService.findOperatorById(operatorId);
    }

    // Done: Metodo POST - Cadastrar novo operador de satélite
    //Endpoint: http://localhost:8080/api/operators/create
    // Body: {"opName":"NASA","role":"BUILDER","country":"USA"}
    @PostMapping("/create")
    public ResponseEntity<Operator> postOperator(@RequestBody Operator operator){
        operatorService.createOperator(operator);
        return ResponseEntity.status(HttpStatus.CREATED).body(operator);
    }

    // Done: Metodo DELETE - Excluir operador de satélite
    //Endpoint: http://localhost:8080/api/operators/delete/{operatorId}
    @DeleteMapping("/delete/{operatorId}")
    public ResponseEntity<Void> deleteOperator(@PathVariable Integer operatorId){
        operatorService.deleteOperator(operatorId);
        return ResponseEntity.noContent().build();
    }
}
