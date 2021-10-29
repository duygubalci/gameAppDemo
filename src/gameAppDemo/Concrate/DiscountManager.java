package gameAppDemo.Concrate;

import gameAppDemo.Abstract.IDiscount;
import gameAppDemo.Entities.Discount;

public class DiscountManager implements IDiscount {

	@Override
	public void discountAdd(Discount discount) {
		System.out.println("Kampanya eklendi: " + discount.getDiscounType() );
		
	}

	@Override
	public void discountDelete(Discount discount) {
		System.out.println("Kampanya silindi : " + discount.getDiscounType() );
		
	}

	@Override
	public void discountUpdate(Discount discount) {
		System.out.println("Kampanya güncellendi : " + discount.getDiscounType() );
		
	}

}
