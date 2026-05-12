package com.curso.cnpjapp.repositories;

import com.curso.cnpjapp.models.ConsultaCnpj;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
// Fixme - Erro de falta de referencia para o DB
public interface ConsultaCnpjRepository extends CrudRepository<ConsultaCnpj, Long> {
    //FIXME - Não indicamos metodo, pois os existentes ja suprem nossa necessidade
}