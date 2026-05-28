package com.curso.GS2026.services;

import com.curso.GS2026.models.Country;
import com.curso.GS2026.models.OperationalRole;
import com.curso.GS2026.models.Operator;
import com.curso.GS2026.repositories.OperatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OperatorService {

    //Done: Injeção de DPs
    @Autowired
    private OperatorRepository operatorRepository;

    // Done: Metodo listar todos os operadores de satélite

    public List<Operator> allOperators() {
        List<Operator> operators = new ArrayList<>();

        //Populando a lista
        operatorRepository.findAll().forEach(operator->{
            operators.add(operator);
            System.out.println(operator);
        });
        return operators;
    }
    // Done: Metodo para listar operador por role
    public List<Operator> listOperatorByRole(OperationalRole role){
        List<Operator> operators = new ArrayList<>();

        List<Operator> operatorList = operatorRepository.findByRole(role);
        operatorList.forEach(operator->
            System.out.println(operator)
        );

        return operatorList;
    }

    // Done: Metodo para listar operador contendo um fragmento do nome

    public List<Operator> findByOpNameContaining(String opNameFragment){

        List<Operator> operatorList = operatorRepository.findByOpNameContaining(opNameFragment);
        operatorList.forEach(operator -> System.out.println(operator));
        return operatorList;
    }

    // Done: Metodo para listar operadores entre paises
    public List<Operator> listByCountry(Country country){
        List<Operator> operatorList = operatorRepository.findByCountry(country);
        operatorList.forEach(operator -> System.out.println(operator));
        return operatorList;
    }

    // Done: Metodo buscar operador por id

    public Operator findOperatorById(Integer operatorId){
        // Criando um operador vazio

        Operator foundOperator = new Operator();

        try{
            foundOperator = operatorRepository.findById(operatorId).get();
            System.out.println("Operador encontrado com sucesso: ");
            System.out.println(foundOperator);
        }
        catch(Exception exception){
            System.out.println("Não foi possível encontrar esse operador.");
            System.out.println(exception);
        }
        return foundOperator;
    }

    // Done: Metodo cadastrar novo operador de satélite

    public Operator createOperator(Operator operator){
        try {
            operatorRepository.save(operator);
            System.out.println("Operador cadastrado com sucesso");
        }
        catch(Exception exception){
            System.out.println("Não foi possível cadastrar este operador.");
        }
        return operator;
    }

    // Done: Metodo excluir operador de satélite

    public void deleteOperator(Integer operatorId){
        try {
            operatorRepository.deleteById(operatorId);
            System.out.println("O Operador de ID: " + operatorId + "foi deletado com sucesso.");
        }
        catch (Exception exception){
            System.out.println("Erro ao deletar este operador.");
            System.out.println(exception);
        }
    }
}
