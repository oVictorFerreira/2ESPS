package com.curso.GS2026.repositories;

import com.curso.GS2026.models.Country;
import com.curso.GS2026.models.OperationalRole;
import com.curso.GS2026.models.Operator;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OperatorRepository extends CrudRepository<Operator, Integer> {

    //Métod0 para listar operador por role

    List<Operator> findByRole(OperationalRole role);

    // Metodo para listar operadores com o nome contendo...

    List<Operator> findByOpNameContaining(String opNameFragment);


    List<Operator> findByCountry(Country country);

}
