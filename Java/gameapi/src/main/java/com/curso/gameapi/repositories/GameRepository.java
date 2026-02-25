package com.curso.gameapi.repositories;

import com.curso.gameapi.models.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Anotação que indica uma interface como repositório com o DB

@Repository

//A interface CrudRepository traz a poossibilidade de trabalhar com métodos de CRUD
// Na sua constituição indicamos <TipoASerTransitado, TipoPK>
public interface GameRepository extends CrudRepository<Game, Integer>{
    //Não precisamos indicar nenhum métod0 no momento

}
