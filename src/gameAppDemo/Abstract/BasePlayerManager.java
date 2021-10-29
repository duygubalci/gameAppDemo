package gameAppDemo.Abstract;

import gameAppDemo.Entities.Player;

public abstract class BasePlayerManager implements IPlayer{
	private IPlayerCheckService playerCheckService;
	
	public BasePlayerManager(IPlayerCheckService playerCheckService) {
		this.playerCheckService=playerCheckService;
	}
	
	@Override
	public void save(Player player) {
		if(this.playerCheckService.chekIfRealPerson(player)) {
			System.out.println("Kullanıcı eklendi : " + player.getFirstName());
		}else {
			System.out.println("Geçerli bir kullanıcı değil.");
		}
	}
}
