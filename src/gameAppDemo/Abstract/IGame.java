package gameAppDemo.Abstract;

import gameAppDemo.Entities.Games;
import gameAppDemo.Entities.Player;

public interface IGame {
	void save(Games game);
	void delete(Games game);
	void update(Games game);
	//void buyGame(Player player, Games game);
	void addBasket(Player player, Games game);
	void addFavourite(Player player, Games game);

}
