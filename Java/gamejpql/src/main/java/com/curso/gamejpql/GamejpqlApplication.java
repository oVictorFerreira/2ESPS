package com.curso.gamejpql;

import com.curso.gamejpql.models.Game;
import com.curso.gamejpql.services.GameService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Year;

@SpringBootApplication
public class GamejpqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(GamejpqlApplication.class, args);

		testador();
	}



	// ---------- Zona de teste -----------

	private static GameService gameService;

	public GamejpqlApplication(GameService gameService) {
		this.gameService = gameService;
	}


	static void testador(){

        Game game1 = new Game("Super Mario Bros", "Nintendo", "Plataforma", Year.of(1983));
		Game game2 = new Game("Super Mario Bros 3", "Nintendo", "Plataforma", Year.of(1987));
		Game game3 = new Game("Super Mario World", "Nintendo", "Plataforma", Year.of(1991));

		Game game4 = new Game("Castlevania", "Konami", "Plataforma", Year.of(1987));
		Game game5 = new Game("Castlevania: Symphony of the Night", "Konami", "Plataforma", Year.of(1996));

		//gameService.insertGame(game1);
		//gameService.insertGame(game2);
		//gameService.insertGame(game3);
		//gameService.insertGame(game4);
		//gameService.insertGame(game5);

		// Testando métodos com query methods

		//gameService.listGamesByGender("Plataforma");

		//gameService.gameByTitleContaining("Mario");

		gameService.listGamesOrderedByTitle();

		gameService.list80games();
	}
}
