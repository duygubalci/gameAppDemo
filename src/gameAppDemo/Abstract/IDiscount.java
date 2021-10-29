package gameAppDemo.Abstract;

import gameAppDemo.Entities.Discount;

public interface IDiscount {
	void discountAdd(Discount discount);
	void discountDelete(Discount discount);
	void discountUpdate(Discount discount);
}
