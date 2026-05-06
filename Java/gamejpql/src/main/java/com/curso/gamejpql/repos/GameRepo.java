package com.curso.gamejpql.repos;

import com.curso.gamejpql.models.Game;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.Year;
import java.util.List;

@Repository
public interface GameRepo extends CrudRepository <Game, Integer>{
    // Criando alguns metodos com query methods
    // Em query methods temos que respeitar a estratégia para nomenclatura dos metodos
    //Métod0 para listar games por gênero

    List<Game> findByGender(String gender);

    // Metodo para listar games com o título contendo...

    List<Game> findByTitleContaining(String titleFragment);

    // Tralhando com JPQL
    // 1- Não é SQL
    // 2- Nao utilizar * para selecionar todos os registros
    // 3- Está do lado do JAVA, por esse motivo devemos indicar os nomes das classes e nao das entidades
    // 4- Trabalhar com Alias para a indicação dos modelos

    //Metodo JPQL para listar todos os títulos em ordem alfabetica
    // Para a utilização de comandos jpql, utilizamos a annotation @Query

    @Query("SELECT g FROM Game g ORDER BY g.title")
    List<Game> allGamesOrderedByTitle();

    // Metodo para listar todos os games em um período entre anos

    @Query("SELECT g FROM Game g WHERE g.releaseYear BETWEEN :startDate AND :endDate")
    List<Game> allGamesBetweenYears(@Param("startDate") Year startDate, @Param("endDate")Year endDaate);
}
