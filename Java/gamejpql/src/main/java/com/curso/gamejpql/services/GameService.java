package com.curso.gamejpql.services;

import com.curso.gamejpql.models.Game;
import com.curso.gamejpql.repos.GameRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Year;
import java.util.List;

@Service
public class GameService {
    // Injeção de DPs
    @Autowired
    private GameRepo gameRepo;

    //Metodo para criar novo registro

    public Game insertGame (Game newGame){

        try{
            gameRepo.save(newGame);
            System.out.println("Game registrado com sucesso");
            System.out.println(newGame);
        }
        catch(Exception exception){
            System.out.println(exception);
        }
        return newGame;
    }

    // Metodo para listar games por genero

    public List<Game> listGamesByGender(String gender){
        List<Game> gameList = gameRepo.findByGender(gender);
        gameList.forEach(game-> System.out.println(game));
        return gameList;
    }
    // Metodo para listar game contendo um fragmento de título

    public List<Game> gameByTitleContaining(String titleFragment){

        List<Game> gameList = gameRepo.findByTitleContaining(titleFragment);
        gameList.forEach(game -> System.out.println(game));
        return gameList;
    }

    // Metodo para listar todos os títulos ordenados alfabeticamente

    public List<Game> listGamesOrderedByTitle(){

        List<Game> gameList = gameRepo.allGamesOrderedByTitle();
        gameList.forEach(game -> System.out.println(game));
        return gameList;
    }

    // Metodo para listar titulos entre anos

    public List<Game> list80games(){
        List<Game> gameList = gameRepo.allGamesBetweenYears(Year.of(1980),Year.of(1989));
        gameList.forEach(game -> System.out.println(game));
        return gameList;
    }
}
