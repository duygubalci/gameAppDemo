package gameAppDemo.Entities;

//import gameAppDemo.Entities.Player;

public class Games{
	int id;
	String gameName;
	double price;
	int starPoint;
	String features;
	double discountRate;
	String discountName;
	
	public Games(){
		
	}
	
	public Games(int id, String gameName, double price, int starPoint, String features, double discountRate, String discountName) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.price = price;
		this.starPoint = starPoint;
		this.features = features;
		this.discountRate = discountRate;
		this.discountName = discountName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStarPoint() {
		return starPoint;
	}

	public void setStarPoint(int starPoint) {
		this.starPoint = starPoint;
	}

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getDiscountName() {
		return discountName;
	}

	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}

}
