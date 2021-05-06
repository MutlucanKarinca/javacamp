package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi : " +game.getGameName() +  " - " + game.getGamePrice() +" TL");		
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun güncellendi : " +game.getGameName() +  " - " + game.getGamePrice() +" TL");	
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi : " +game.getGameName());			
		
	}

}
