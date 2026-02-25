package com.curso.gameapi.services;


import com.curso.gameapi.models.Game;
import com.curso.gameapi.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

// Anotação que indica que uma classe será produtora de regras de negócio - Service
@Service
public class GameService {

    //Done: Injeção do repository
    @Autowired //faz a autoinjeção de dependência entre as camadas MVC (Model, view, controller), no application não funciona pq está fora do MVC
    private GameRepository gameRepository;

    //Done: Métod0 responsável por criar um novo game
    public Game createGame(Game newGame) {
        try{
            gameRepository.save(newGame);
            System.out.println("Game created successfully");
        } catch(Exception excep){
            System.out.println("Error creating game: ");
            System.out.println(excep);
        }
        return newGame;
    }

    //Done: Métod0 responsável por buscar um game por ID
    public Game gameById(Integer gameId) {

        //Criando um game vazio
        Game foundGame = new Game();

        try{
            //tentando popular o foundGame
            foundGame = gameRepository.findById(gameId).get();
            System.out.println("Game found successfully");
            System.out.println(foundGame);

        }catch(Exception excep){
            System.out.println("Error finding game: ");
            System.out.println(excep);
        }
        return foundGame;
    }

    //Done: Métod0 responsável por listar todos os games

    public ArrayList<Game> allGames() {

        //Criando lista vazia
        ArrayList<Game> all = new ArrayList<>();

        //Populando array
        gameRepository.findAll().forEach(game->{
            all.add(game);
            System.out.println(game);
        });

        return all;
    }
}
