package com.curso.gameapi;

import com.curso.gameapi.models.Game;
import com.curso.gameapi.services.GameService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Year;

@SpringBootApplication
public class GameapiApplication {

	public static void main(String[] args) {

        SpringApplication.run(GameapiApplication.class, args);
        testador();
	}



    //Zona de teste
    //static - liberação somente para que faça parte de uma classe
    // Done - Injetar o service
    // Injeção por construtor

    private static GameService gameService;

    public GameapiApplication(GameService gameService) {
        this.gameService = gameService;
    }

    static void testador(){
        //Criando um game
        Game gameA = new Game("Resident Evil Requiem", "Capcom", "Terror", Year.of(2026));
        //gameService.createGame(gameA);

        gameService.gameById(1);

        //gameService.allGames();
    }



    //Zona de teste
}
