package gameAppDemo.Concrate;

import gameAppDemo.Abstract.*;
import gameAppDemo.Entities.*;

public class SaleManager implements ISale {

	@Override
	public void sale(Player player, Games game, Discount discount) {
		double price =  game.getPrice() - ((game.getPrice() * discount.getDiscountRate())/100);
        System.out.println(player.getFirstName() + " " + player.getLastName() + " "+game.getGameName() +
                " isimli oyununu satın aldı "+discount.getDiscounType() + " indirimi ile "+ 
                "\nfiyatı : "+price+"$");
		
	}

}
