package Concrete;

import java.util.List;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Oyun başarıyla eklendi: "+game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun başarıyla silindi: "+game.getName());
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun başarıyla güncellendi: "+game.getName());
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
