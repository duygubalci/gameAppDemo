package gameAppDemo.Entities;

public class Discount{
	String discounType;
	double discountRate;
	public Discount() {
		
	}
	public Discount(String discounType, double discountRate) {
		super();
		this.discounType = discounType;
		this.discountRate = discountRate;
	}
	public String getDiscounType() {
		return discounType;
	}
	public void setDiscounType(String discounType) {
		this.discounType = discounType;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}



}
