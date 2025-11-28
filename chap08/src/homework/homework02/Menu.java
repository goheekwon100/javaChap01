package homework.homework02;

public abstract class Menu {
	private String name;
	private int price;
	protected Menu(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	protected Menu() {
		super();
	}
	
	public String toString() {
		String result = "메뉴명은 " + name + "가격은 " + price + "원 입니다.";
		return result;
	}
	public abstract void cook();
}
