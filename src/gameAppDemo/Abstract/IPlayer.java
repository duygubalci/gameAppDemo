package gameAppDemo.Abstract;

import gameAppDemo.Entities.Player;

public interface IPlayer {
	//void register(Player player);
	void save(Player player);
	void update(Player player);
	void delete(Player player);

}
