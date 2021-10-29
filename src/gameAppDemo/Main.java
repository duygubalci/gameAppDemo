package gameAppDemo;

import gameAppDemo.Abstract.*;
import gameAppDemo.Adapters.*;
import gameAppDemo.Concrate.*;
import gameAppDemo.Entities.*;

public class Main {

	public static void main(String[] args) {
		
		BasePlayerManager playerManager =new WomenPlayerManager(new MernisServiceAdapter());
		GameManager gameManager= new GameManager();
		SaleManager saleManager = new SaleManager();
		
		Player player = new Player("24709574334","Duygu", "Balcı", 1990);
		playerManager.save(player);
	
		Player player2 = new Player("28861499108","Engin", "Demiroğ", 1985);
		playerManager.save(player2);
		
		Games game1 = new Games(1, "Futbol Oyunu", 3500, 20, "Yeni çıktı", 10, "Yılbaşı İndirimi"); 
		Games game2 = new Games(2, "Basketbol Oyunu", 4500, 10, "En iyi basket oyunu", 10, "Sene sonu İndirimi");
		
		Discount discount = new Discount("İndirim", 50.2);		
		
		gameManager.buyGame(player, game1);
		gameManager.addBasket(player2, game2);
		gameManager.addFavourite(player, game2);
		saleManager.sale(player2, game2, discount);
		
		discount.setDiscountRate(30); discount.setDiscounType("Yılbaşı");
		saleManager.sale(player, game1, discount);

	}

}
