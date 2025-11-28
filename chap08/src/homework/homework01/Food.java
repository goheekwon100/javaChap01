package homework.homework01;

public class Food extends Product{
	private int expirationDays;

	public Food(String name, int price, int expirationDays) {
		super(name, price);
		this.expirationDays = expirationDays;
	}

	public Food(String name, int price) {
		super(name, price);
	}

	public int getExpirationDays() {
		return expirationDays;
	}
	
	@Override
	public int calculatePrice() {
		int price = getPrice() /100 * (100-calculateDisacountRate());
		return price;
	}
	
	public int calculateDisacountRate() {
		int discountRate;
		if (expirationDays <= 1) {
			discountRate = 80;
		}else if(expirationDays <= 5){
			discountRate = 50;
		}else if(expirationDays <= 10){
			discountRate = 20;
		}else {
			discountRate = 0;
		}
		return discountRate;
	}
}
