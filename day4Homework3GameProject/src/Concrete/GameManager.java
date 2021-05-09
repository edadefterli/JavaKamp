package Concrete;

import java.util.List;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Oyun ba�ar�yla eklendi: "+game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun ba�ar�yla silindi: "+game.getName());
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun ba�ar�yla g�ncellendi: "+game.getName());
	}

	@Override
	public String getGame(Game game) {
		return game.getName() +":" + game.getGameContent();
	}
	
	@Override
	public List<Game> getall() {
		return null;
	}

	

}
