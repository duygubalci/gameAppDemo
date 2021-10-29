package gameAppDemo.Concrate;

import gameAppDemo.Abstract.IGame;
import gameAppDemo.Entities.*;

public class GameManager implements IGame{

	@Override
	public void save(Games game) {
		System.out.println("Oyun kaydedildi. Oyun bilgileri : " + game.getGameName());
		
	}

	@Override
	public void addBasket(Player player, Games game) {
		System.out.println(game.getGameName() + " isimli oyun " + player.getFirstName() + " tarafından sepete eklendi ");
		
	}

	@Override
	public void addFavourite(Player player, Games game) {
		System.out.println(game.getGameName() + " isimli oyun " + player.getFirstName() + " tarafından favorilere eklendi ");
		
	}

	@Override
	public void delete(Games game) {
		System.out.println(game.getGameName() + " isimli oyun silindi ");
		
	}

	@Override
	public void update(Games game) {
		System.out.println(game.getGameName() + " isimli oyun güncellendi ");
		
	}
}
